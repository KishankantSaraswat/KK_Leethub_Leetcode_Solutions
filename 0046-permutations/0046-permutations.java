class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        print(nums,new ArrayList<>(),res);
        return res;
    }

    public static void print(int [] nums,List<Integer>lst,List<List<Integer>>res){
        if(lst.size()==nums.length){
            res.add(new ArrayList<>(lst));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(lst.contains(nums[i])){
                continue;
            }
            lst.add(nums[i]);
            print(nums,lst,res);
            lst.remove(lst.size()-1);
        }
    }
}