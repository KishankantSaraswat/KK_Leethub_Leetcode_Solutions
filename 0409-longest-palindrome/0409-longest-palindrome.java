class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer>map=new HashMap<>();

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int sum=0;
        boolean flag=false;

        for(int i:map.values()){
            if(i%2==0){
                sum+=i;
            }else{
                sum+=i-1;
                flag=true;
            }

        }
        if(flag) return sum+1;
        return sum;

        
    }
}