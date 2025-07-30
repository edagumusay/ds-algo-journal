/*
 * Single Frequency Array Approach:
 * Use a fixed-size int array to track counts by character index.
 * 
 * Time: O(n)
 * Space: O(1) – constant space for lowercase English letters
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}
