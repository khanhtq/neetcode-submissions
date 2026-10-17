//Truong Thi My Duyen
// class Solution {
//     public int evalRPN(String[] tokens) {
//         Stack<Integer> st = new Stack<>();

//         for (String token : tokens) {
//             if (!isOperation(token)) {
//                 st.push(Integer.parseInt(token));
//             } else {
//                 int b = st.pop();
//                 int a = st.pop();

//                 int result = calculator(a, b, token);
//                 st.push(result);
//             }
//         }

//         return st.pop();
//     }

//     private boolean isOperation(String s) {
//         return s.equals("+") || s.equals("-")
//             || s.equals("*") || s.equals("/");
//     }

//     private int calculator(int a, int b, String op) {
//         if (op.equals("+")) return a + b;
//         if (op.equals("-")) return a - b;
//         if (op.equals("*")) return a * b;
//         return a / b;
//     }
// }

class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                case "-":
                case "*":
                case "/":
                    int b = st.pop();
                    int a = st.pop();

                    switch (token) {
                        case "+": st.push(a + b); break;
                        case "-": st.push(a - b); break;
                        case "*": st.push(a * b); break;
                        case "/": st.push(a / b); break;
                    }
                    break;

                default:
                    st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }
}
