class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] res=new int[nums.length];
        int [] t1=new int[nums.length];
        int [] t2=new int[nums.length];

        t1[0]=1;
        t2[nums.length-1]=1;


        for(int i=0;i<nums.length-1;i++){
            t1[i+1]=nums[i]*t1[i];
        }

        for(int i=nums.length-1; i>0;i--){
            t2[i-1]=nums[i]*t2[i];
        }

        for(int i=0;i<nums.length;i++){
            res[i]=t1[i]*t2[i];
        }

        return res;
    }
}