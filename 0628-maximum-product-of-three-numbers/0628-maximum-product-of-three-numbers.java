class Solution {
    public int maximumProduct(int[] arr) {
        int pro=1;
        int  n=arr.length;
        Arrays.sort(arr);


        if(arr.length<3){
            return -1;
        }
        return Math.max(arr[0] * arr[1] * arr[n - 1],
                arr[n - 1] * arr[n - 2] * arr[n - 3]);
        
    }
}