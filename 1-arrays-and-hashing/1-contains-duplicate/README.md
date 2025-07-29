# Contains Duplicate

**Link:** [LeetCode 217 - Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)

## Problem Statement

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and `false` if every element is distinct.

---

## Approaches

- **Brute Force**  
  Compare each element with every other element using nested loops. Simple but inefficient.  
  Time: O(n²), Space: O(1)

- **Sorting**  
  Sort the array and check adjacent elements for duplicates.  
  Time: O(n log n), Space: O(1)

- **HashSet**  
  Use a hash set to track seen elements. Fast and clean for most cases.  
  Time: O(n), Space: O(n)

- **BitSet**  
  Use Java's `BitSet` to efficiently track seen non-negative integers (within a limited range).  
  Time: O(n), Space: O(m), where `m` is the max number in `nums`

---

## Notes

- The brute force approach will likely cause a **TLE (Time Limit Exceeded)** on large inputs and should be avoided in practice.
- The BitSet approach only works if the input values are **non-negative** and within a **reasonable numeric range**.
- The HashSet method is generally the best balance between simplicity and performance for this problem.
