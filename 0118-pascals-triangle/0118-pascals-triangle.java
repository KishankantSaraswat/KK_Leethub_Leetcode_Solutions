class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>res=new ArrayList<>();
        int [][] arr=new int[numRows][numRows];
        for(int i=0;i<numRows;i++){
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            List<Integer>lst=new ArrayList<>();
            for(int j=0;j<i+1;j++){
                lst.add(arr[i][j]);
            }
            res.add(lst);
        }
        return res;
        
    }
    
}