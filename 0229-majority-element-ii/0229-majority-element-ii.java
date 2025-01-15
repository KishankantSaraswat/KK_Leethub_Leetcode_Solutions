class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        int k=nums.length/3;
        Map<Integer, Integer> map =new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(int n:map.keySet()){
            if(map.get(n)>k){
                lst.add(n);
            }
        }
        return lst;
        
    }
}