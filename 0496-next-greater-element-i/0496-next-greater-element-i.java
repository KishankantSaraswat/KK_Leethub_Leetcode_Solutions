class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // brute force 
        int [] arr=new int[nums2.length];
        for(int i=0;i<nums2.length;i++){
            arr[i] = -1;
            for(int j=i+1;j<=nums2.length-1;j++){
                if(nums2[i]<nums2[j]){
                    arr[i]= nums2[j];
                    break;
                }else{
                    arr[i]=-1;
                }
            }

        }

        int [] arr1=new int[nums1.length];
        for(int i=0; i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    arr1[i]=arr[j];
                    break;
                }
            }
        }
        return arr1;


       

        
    }
}