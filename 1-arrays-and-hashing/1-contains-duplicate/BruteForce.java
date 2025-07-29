/*
 * Brute Force Approach:
 * Compare each element with every other element using nested loops. Simple but inefficient.
 * This approach will likely cause a TLE (Time Limit Exceeded) on large inputs and should be avoided in practice.
 *
 * Time: O(n^2)
 * Space: O(1)
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
