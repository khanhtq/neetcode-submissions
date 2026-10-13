class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int []prefixMax = new int[n+1];
        int []suffixMax = new int[n+1];

        int preMax = 0, suffMax = 0;
        for (int i = 0; i < n; i++) {
            prefixMax[i] = preMax;
            suffixMax[n-1-i] = suffMax;
            preMax = Math.max(preMax, height[i]);
            suffMax = Math.max(suffMax, height[n-1-i]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int areaLocal = Math.min(prefixMax[i], suffixMax[i]) - height[i];
            if (areaLocal > 0)
                sum += areaLocal;
        }

        return sum;
    }
}
