import java.util.HashSet;
import java.util.Set;

/*
 * HashSet Approach:
 * Use a hash set to track seen elements. Fast and clean for most cases.
 *
 * Time: O(n)
 * Space: O(n)
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
