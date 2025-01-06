class Solution {
    public int lengthOfLastWord(String s) {
        // String trimmedStr = s.replaceAll("\\s+$", "");
        String trimmedStr=s.trim();
        int cnt=0;
        for(int i=trimmedStr.length()-1;i>=0;i--){
            char ch=trimmedStr.charAt(i);

            if(ch==' '){
                break;
            }
            cnt++;
            

        }
        return cnt;
        
    }
}