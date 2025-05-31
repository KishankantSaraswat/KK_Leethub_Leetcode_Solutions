class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int maxLeft = 0;
        int maxRight = 0;
        
        for (int i = 0; i < n; i++) {
            left[i] = maxLeft;
            maxLeft = Math.max(maxLeft, height[i]);
        }
        
        for (int i = n - 1; i >= 0; i--) {
            right[i] = maxRight;
            maxRight = Math.max(maxRight, height[i]);
        }
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(left[i], right[i]);
            if (minHeight > height[i]) {
                ans += minHeight - height[i];
            }
        }
        
        return ans;
    }
}
