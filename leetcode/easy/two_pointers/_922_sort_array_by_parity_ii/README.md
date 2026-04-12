# 922. Sort Array By Parity II

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Two Pointers
- Folder Path: `leetcode/easy/two_pointers/_922_sort_array_by_parity_ii`
- Folder Name: `_922_sort_array_by_parity_ii`
- Official Link: https://leetcode.com/problems/sort-array-by-parity-ii/

## Problem Overview
Given an array `nums` of even length, half of the integers are even and half are odd.

Sort the array so that:
- every **even** index contains an **even** number
- every **odd** index contains an **odd** number

You may return **any** valid answer.

## Approach (Two Pointers)
Track two indices:
- `even = 0` (should be even)
- `odd = 1` (should be odd)

If `nums[even]` is odd and `nums[odd]` is even, swap them. Otherwise advance whichever pointer is currently correct.

## Complexity
- Time: `O(n)`
- Space: `O(1)` extra space

## Files
- `SortArrayByParityII.java` - solution
- `SortArrayByParityIITest.java` - small main-based test runner

