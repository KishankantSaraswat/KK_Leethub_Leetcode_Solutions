class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE; 
        int n = nums.length;
        int j = 0;
        int sum = 0;
        
        for (int i = 0; i < n; i++) { // Move i from 0 to n-1
            sum += nums[i];
            
            
            while (sum >= target) {
                
                res = Math.min(res, i - j + 1);
                sum -= nums[j]; // Subtract the leftmost element
                j++; // Move the left pointer to the right
            }
        }

        return (res == Integer.MAX_VALUE) ? 0 : res; // Return 0 if no valid subarray is found
    }
}
