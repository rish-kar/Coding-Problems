# 905. Sort Array By Parity

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Two Pointers
- Folder Path: `leetcode/easy/two_pointers/_905_sort_array_by_parity`
- Folder Name: `_905_sort_array_by_parity`
- Official Link: https://leetcode.com/problems/sort-array-by-parity/

## Problem Overview
Given an integer array `nums`, move all the **even** integers to the beginning of the array followed by all the **odd** integers.

You may return **any** array that satisfies this condition (the relative order within evens/odds does not matter).

## Approach (Two Pointers)
Maintain two pointers:
- `low` from the start looking for an odd
- `high` from the end looking for an even

When `nums[low]` is odd and `nums[high]` is even, swap them and move both pointers. Otherwise, move the pointer that is currently on a correctly-placed value.

## Complexity
- Time: `O(n)`
- Space: `O(1)` extra space (in-place)

## Files
- `SortArrayByParity.java` - solution
- `SortArrayByParityTest.java` - small main-based test runner

