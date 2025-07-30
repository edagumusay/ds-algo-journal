import java.util.Arrays;

/*
 * Sorting Approach:
 * Sort both strings and compare them. If they are anagrams, their sorted forms will be identical.
 * 
 * Time: O(n log n)
 * Space: O(n)
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
