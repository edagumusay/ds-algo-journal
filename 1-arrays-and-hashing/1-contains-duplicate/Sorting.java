import java.util.Arrays;

/*
 * Sorting Approach:
 * Sort the array and check adjacent elements for duplicates.
 *
 * Time: O(n log n)
 * Space: O(1)
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }
        return false;
    }
}
