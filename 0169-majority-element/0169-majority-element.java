class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        int count=1;
        int max=1;
        int major=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
                if(count>max){
                    max=count;
                    major=nums[i];
                }
                
            }
            else{
                    count=1;
                }
            
        }
        return major;
    }
}

