//Truong Thi My Duyen
class Solution {
    // Compare String
    // public boolean checkInclusion(String s1, String s2) {
    //     if (s1.length() > s2.length()) return false;

    //     char[] arr1 = s1.toCharArray();
    //     Arrays.sort(arr1);
    //     s1 = new String(arr1);

    //     int left = 0;
    //     int len = s1.length();

    //     for (int right = len; right <= s2.length(); right++) {
    //         char[] arr2 = s2.substring(left, right).toCharArray();
    //         Arrays.sort(arr2);

    //         if (new String(arr2).equals(s1)) {
    //             return true;
    //         }

    //         left++;
    //     }

    //     return false;
    // }

    //Sliding Window
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        
        int []f1 = new int[26];
        int []f2 = new int[26];

        for (char ch : s1.toCharArray()) {
            f1[ch-'a']++;
        }

        for (int i = 0; i < s1.length(); i++) {
            f2[s2.charAt(i)-'a']++;
        }

        if (Arrays.equals(f1, f2)) return true;

        int left = 0;
        for (int right = s1.length(); right < s2.length(); right++) {
            f2[s2.charAt(left)-'a']--;
            f2[s2.charAt(right)-'a']++;
            left++;

            if (Arrays.equals(f1, f2)) return true;
        }

        return false;
    }
}
