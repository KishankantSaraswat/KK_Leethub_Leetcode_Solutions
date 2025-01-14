import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) { // Start with 0-based indexing
            List<Integer> lst = new ArrayList<>();
            for (int j = 0; j <= i; j++) { // Iterate from 0 to i (inclusive)
                int r = combination(i, j);
                lst.add(r);
            }
            res.add(lst);
        }
        return res;
    }

    public int combination(int n, int r) {
        long result = 1; // Use long to avoid overflow
        for (int i = 0; i < r; i++) {
            result = result * (n - i) / (i + 1); // Iterative computation
        }
        return (int) result; // Cast back to int as output
    }
}
