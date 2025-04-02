class Solution {
    public long maximumTripletValue(int[] nums) {
        long sum=0;
        int n=nums.length;
        long max=sum;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    max = Math.max(max, (long) (nums[i] - nums[j]) * nums[k]);
                }
            }
        }
       
        return max;
        
    
    }
}
// class Solution {
//     public long maximumTripletValue(int[] nums) {
//         int n = nums.length;
//         long maxTripletValue = 0;

//         for (int i = 0; i < n - 2; i++) {
//             for (int j = i + 1; j < n - 1; j++) {
//                 for (int k = j + 1; k < n; k++) {
//                     maxTripletValue = Math.max(maxTripletValue, (long) (nums[i] - nums[j]) * nums[k]);
//                 }
//             }
//         }

//         return maxTripletValue;
//     }
// }