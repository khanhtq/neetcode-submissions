class Solution {
    public int[] productExceptSelf(int[] nums) {
        int productAll = 1;
        int numOfZero = 0;
        for (int num : nums) {
            if (num != 0) productAll *= num;
            else {
                numOfZero++;
            }
        }

        int[] res = new int[nums.length];
        if (numOfZero > 1) return res;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (numOfZero != 0) res[i] = 0;
                else 
                    res[i] = productAll / nums[i];
            }
            else {
                res[i] = productAll;
            }
        }

        return res;
    }
}  
