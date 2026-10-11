// class Solution {
//     public boolean isPalindrome(String s) {
//         int left = 0, right = s.length()-1;
//         char arr[] = s.toLowerCase().toCharArray();

//         while (left <= right) {
//             while (left < right &&
//                    !Character.isLetterOrDigit(arr[left])) {
//                 left++;
//             }

//             while (left < right &&
//                    !Character.isLetterOrDigit(arr[right])) {
//                 right--;
//             }

//             if (arr[left] != arr[right]) {
//                 return false;
//             }

//             left++;
//             right--;
//         }

//         return true;
//     }
// }


class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;
        char arr[] = s.toLowerCase().toCharArray();

        while (left <= right) {
            while (left < right &&
                   !Character.isLetterOrDigit(arr[left])) {
                left++;
            }

            while (left < right &&
                   !Character.isLetterOrDigit(arr[right])) {
                right--;
            }

            if (arr[left] != arr[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
