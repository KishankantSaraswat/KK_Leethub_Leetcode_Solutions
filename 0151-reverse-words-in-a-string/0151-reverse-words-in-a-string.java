class Solution {
    public String reverseWords(String s) {
       // s=s.trim();
        String str="";
        String [] arr=s.split("\\s+");
        for(int i=arr.length-1;i>=0;i--){
            str+=arr[i]+" ";
        }
        str=str.trim();
        return str;

        
    }
}