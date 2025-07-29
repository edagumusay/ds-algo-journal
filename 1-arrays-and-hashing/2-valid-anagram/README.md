# Valid Anagram

**Link:** [LeetCode 242 - Valid Anagram](https://leetcode.com/problems/valid-anagram/)

## Problem Statement

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all original letters exactly once.

---

## Approaches

- **Sorting**  
  Sort both strings and compare them. If they are anagrams, their sorted forms will be identical.  
  Time: O(n log n)  
  Space: O(n)

- **HashMap / Frequency Counter**  
  Count character frequencies using a hash map or integer array (since inputs are lowercase). Compare both frequency maps.  
  Time: O(n)  
  Space: O(1) (since alphabet size is constant)

- **Single Frequency Array**  
  Use a single fixed-size array to increment counts for `s` and decrement for `t`. If the result is all zeroes, they are anagrams.  
  Time: O(n)  
  Space: O(1)

---

## Notes

- Sorting is intuitive but slightly less efficient due to the O(n log n) time.
- Frequency counting is optimal and performs better on larger inputs.
- The one-array counter approach is a refined, space-efficient version of the hash map method.
