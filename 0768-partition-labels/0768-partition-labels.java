
class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> lst = new ArrayList<>();
        int n = s.length();
        
        // Last occurrence of each character
        int[] lastOccurrence = new int[26];
        for (int i = 0; i < n; i++) {
            lastOccurrence[s.charAt(i) - 'a'] = i;
        }

        int start = 0;
        int end = 0;
        
        for (int i = 0; i < n; i++) {
            end = Math.max(end, lastOccurrence[s.charAt(i) - 'a']);
            if (i == end) {
                lst.add(end - start + 1);
                start = i + 1;
            }
        }
        
        return lst;
    }
}

