class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] arr=new int [nums.length];
        boolean flag;

        for(int i=0;i<nums.length;i++){
            flag=false;

            for(int j=i;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    arr[i]=nums[j];
                    flag=true;
                    break;
                }

            }

            if(!flag){
                for(int j=0;j<nums.length;j++){
                    if(nums[i]<nums[j]){
                        arr[i]=nums[j];
                        flag=true;
                        break;
                    }else{
                        arr[i]=-1;
                    }
                }
            }
        }

        return arr;
        
    }
}