class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        //if length of nums1 and nums2 then return 0

        


        int ans=0;
        int a=nums1.length;
        int b=nums2.length;

        if(a%2==0 && b%2==0) return 0;
        

        if(a%2==0 && b%2!=0){
            for(int i=0;i<a;i++){
                ans^=nums1[i];
            }
        }else if(a%2!=0 && b%2==0){
            for(int i=0;i<b;i++){
                ans^=nums2[i];
            }
        }
        else{
            for(int i=0;i<a;i++){
                ans^=nums1[i];
            }
            for(int i=0;i<b;i++){
                ans^=nums2[i];
            }
        }

        return ans;
        
        
    }
}