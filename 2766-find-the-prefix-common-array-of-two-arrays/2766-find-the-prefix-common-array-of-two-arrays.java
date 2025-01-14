class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer>set=new HashSet<>();
        int count=0;
        for(int i=0;i<A.length;i++){
            if(!set.add(A[i])){
                count++;
            }
            if(!set.add(B[i])){
                count++;
            }
            A[i]=count;
        }

        return A;
    }
}