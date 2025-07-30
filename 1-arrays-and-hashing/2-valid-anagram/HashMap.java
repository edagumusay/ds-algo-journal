import java.util.HashMap;

/*
 * HashMap Approach:
 * Count characters in both strings and compare the maps.
 * 
 * Time: O(n)
 * Space: O(1) – since the alphabet is fixed (26 lowercase letters)
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> count = new HashMap<>();

        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!count.containsKey(c)) return false;
            count.put(c, count.get(c) - 1);
            if (count.get(c) < 0) return false;
        }

        return true;
    }
}
