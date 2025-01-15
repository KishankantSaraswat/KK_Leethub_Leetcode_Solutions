import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        int n = nums.length;
        int threshold = n / 3;

        for (int i = 0; i < n; i++) {
            if (!lst.contains(nums[i])) {  // Check if the number is already in the list
                int count = 0;  // Reset count for the new element
                // Count occurrences of nums[i]
                for (int j = 0; j < n; j++) {
                    if (nums[j] == nums[i]) {
                        count++;
                    }
                }
                // If count exceeds threshold, add it to the list
                if (count > threshold) {
                    lst.add(nums[i]);
                }
            }
        }
        return lst;
    }
}
