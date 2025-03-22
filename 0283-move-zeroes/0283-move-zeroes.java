class Solution {
    public void moveZeroes(int[] nums) {
        int [] arr=new int [nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            arr[j]=0;
            if(nums[i]!=0){
                arr[j]=nums[i];
                j++;
            }
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];

        }

       
    }
}