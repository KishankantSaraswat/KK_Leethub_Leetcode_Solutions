class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>>res=new HashSet<>();
        print(nums,new ArrayList<>(),res,0);
        return new ArrayList<>(res);
        
    }

    public static void print(int []nums,List<Integer>curr,Set<List<Integer>>res ,int lp){
        if(curr.size()>=2){
            res.add(new ArrayList<>(curr));
        }
        // res.add(new ArrayList<>(curr));  
        
        for(int i=lp;i<nums.length;i++){
            // if(i>lp && nums[i]==nums[i-1]) continue;
            // if(i>0 && nums[i]<nums[i-1]) continue;

            if (curr.isEmpty() || nums[i] >= curr.get(curr.size() - 1)){
                curr.add(nums[i]);
                print(nums,curr,res,i+1);
                curr.remove(curr.size()-1);
            }
            
            
        }
    }
}