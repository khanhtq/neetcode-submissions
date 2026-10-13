//Truong Thi My Duyen
class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int []f = new int[26];
        int maxf = 0;
        int maxl = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            f[ch - 'A']++;
            maxf = Math.max(maxf, f[ch - 'A']);
            
            while ((right - left + 1) - maxf > k) {
                f[s.charAt(left) - 'A']--;
                left++;
            }

            maxl = Math.max(maxl, right - left + 1);
        }
        
        return maxl;
    }
}
