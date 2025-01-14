class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) { 
            int r = combination(rowIndex, i);
            lst.add(r);
            
        }
        
        return lst;
    }
    public int combination(int n, int r) {
        long result = 1; // Use long to avoid overflow
        for (int i = 0; i < r; i++) {
            result = result * (n - i) / (i + 1); // Iterative computation
        }
        return (int) result; // Cast back to int as output
    }
}

