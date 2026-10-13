//Truong Thi My Duyen
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        s1 = new String(arr1);

        int left = 0;
        int len = s1.length();

        for (int right = len; right <= s2.length(); right++) {
            char[] arr2 = s2.substring(left, right).toCharArray();
            Arrays.sort(arr2);

            if (new String(arr2).equals(s1)) {
                return true;
            }

            left++;
        }

        return false;
    }
}
