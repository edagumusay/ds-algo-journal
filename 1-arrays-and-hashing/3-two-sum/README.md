# Two Sum

**Link:** [LeetCode 1 - Two Sum](https://leetcode.com/problems/two-sum/)

## Problem Statement

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have **exactly one solution**, and you may not use the same element twice.

You can return the answer in any order.

---

## Approaches

- **Brute Force**
  - Check all pairs using nested loops to find a pair that sums to the target.
  - Time: O(n²)
  - Space: O(1)

- **Hash Map**
  - Use a hash map to store previously seen numbers and their indices.
  - For each number `x`, check if `target - x` has been seen before.
  - Time: O(n)
  - Space: O(n)

---

## Notes

- Only one valid solution is guaranteed.
- Indices must be returned, not the values.
