class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int actual=n*(n+1)/2;
        int unique=0;
        int array=0;

        Set<Integer>set=new HashSet<>();


        for(int i:nums){
            array+=i;
        }
        for(int k:nums){
            set.add(k);
        }

        for(int k:set ){
            unique+=k;
        }

        int miss=actual-unique;
        int dup=array-unique;

        return new int [] {dup,miss};
        
    }
}