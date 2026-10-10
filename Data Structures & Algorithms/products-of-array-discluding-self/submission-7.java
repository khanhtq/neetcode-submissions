//Truong Thi My Duyen
class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] res = new int[nums.length];

        res[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int suffix = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= nums[i];
        }

        return res;
    }    
    
    
    //Easy to read.....
    // public int[] productExceptSelf(int[] nums) {
    //     int productAll = 1;
    //     int numOfZero = 0;

    //     for (int num : nums) {
    //         if (num != 0) productAll *= num;
    //         else {
    //             numOfZero++;
    //         }
    //     }

    //     int[] res = new int[nums.length];
    //     if (numOfZero > 1) return res;

    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] != 0) {
    //             if (numOfZero != 0) res[i] = 0;
    //             else 
    //                 res[i] = productAll / nums[i];
    //         }
    //         else {
    //             res[i] = productAll;
    //         }
    //     }

    //     return res;
    // }
}  
