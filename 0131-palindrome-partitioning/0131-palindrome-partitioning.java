class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>res=new ArrayList<>();
        print(s ,new ArrayList<>(),res);
        return res;
    }
    public static void print(String s,List<String>curr,List<List<String>>res){
        if(s.length()==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<s.length();i++){
            String str=s.substring(0,i+1);
            if(check(str)){
                curr.add(str);
                print(s.substring(i+1),curr,res);
                curr.remove(curr.size()-1);
            }
        }
    }
    public static boolean check(String s){
        int l=0;
        int r=s.length()-1;

        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;

    }
}