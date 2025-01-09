class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> lst=new ArrayList<>();
        
        if(nums.length==0) return lst;
        int start;
        for(int i=0;i<nums.length;i++){
            start=nums[i];

            while(i<nums.length-1 && nums[i+1]-nums[i]==1){
                i++;
            }

            if(start!=nums[i]){
                lst.add(start+"->"+nums[i]);
            }else{
                lst.add(String.valueOf(start));
            }
        }

        return lst;

        
    }
}


