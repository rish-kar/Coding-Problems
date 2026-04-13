# 643. Maximum Average Subarray I

**Difficulty:** Easy  
**Link:** https://leetcode.com/problems/maximum-average-subarray-i/

## Problem
Given an integer array `nums` consisting of `n` elements, and an integer `k`.

Find a contiguous subarray whose **length is equal to `k`** that has the **maximum average value** and return this value.

## Approach (Sliding Window)
Maintain the sum of a window of size `k`:

1. Compute the sum of the first `k` elements.
2. Slide the window by one element at a time:
   - subtract the element leaving the window
   - add the element entering the window
3. Track the maximum window sum seen so far; answer is `maxSum / k`.

## Complexity
- **Time:** `O(n)`
- **Space:** `O(1)`

## Notes
This solution also contains a few defensive checks (null array, invalid `k`) that bypass LeetCode constraints.

