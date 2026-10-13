//Truong Thi My Duyen
class Solution {
    //Suffix-Prefix
    // public int trap(int[] height) {
    //     int n = height.length;
    //     int []prefixMax = new int[n+1];
    //     int []suffixMax = new int[n+1];

    //     int preMax = 0, suffMax = 0;

    //     for (int i = 0; i < n; i++) {
    //         prefixMax[i] = preMax;
    //         suffixMax[n-1-i] = suffMax;
    //         preMax = Math.max(preMax, height[i]);
    //         suffMax = Math.max(suffMax, height[n-1-i]);
    //     }

    //     int sum = 0;
    //     for (int i = 0; i < n; i++) {
    //         int areaLocal = Math.min(prefixMax[i], suffixMax[i]) - height[i];
    //         if (areaLocal > 0)
    //             sum += areaLocal;
    //     }

    //     return sum;
    // }

    //Two-Pointer
    public int trap(int[] height) {
        int left = 0, right = height.length-1;
        int maxLeft = 0, maxRight = 0;
        
        int sum = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                maxLeft = Math.max(maxLeft, height[left]);
                sum += maxLeft - height[left];
                left++;
            }
            else {
                maxRight = Math.max(maxRight, height[right]);
                sum += maxRight - height[right];
                right--;
            }
        }

        return sum;
    }
}
