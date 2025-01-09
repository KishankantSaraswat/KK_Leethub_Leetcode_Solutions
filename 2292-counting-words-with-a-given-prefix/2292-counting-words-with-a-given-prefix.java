class Solution {
    public int prefixCount(String[] words, String pref) {
        int n=pref.length();

        
        int count=0;
        for(String str : words){
            if(n <= str.length() && pref.equals(str.substring(0,n)) ){
                count++;
            }
        }

        return count;
    }
}