class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=n+m;
        int [] arr=new int[l];
        int k=0;
        for(int i=0;i<m;i++){
            arr[k]=nums1[i];
            k++;
        }
        for(int i=0;i<n;i++){
            arr[k]=nums2[i];
            k++;
        }
        Arrays.sort(arr);
        for(int i=0;i<l;i++){
            nums1[i]=arr[i];
        }

    }
}