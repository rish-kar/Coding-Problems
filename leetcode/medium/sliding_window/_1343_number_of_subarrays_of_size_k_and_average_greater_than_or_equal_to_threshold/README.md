# 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

**Difficulty:** Medium  
**Link:** https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/

## Problem
Given an integer array `arr`, an integer `k` and an integer `threshold`, return the number of sub-arrays of size `k` whose average is greater than or equal to `threshold`.

## Approach (Sliding Window)
- Maintain the sum of a window of length `k`.
- For each window, check whether `windowSum / k >= threshold` and count it.

## Complexity
- **Time:** `O(n)`
- **Space:** `O(1)`

## Notes
This solution includes defensive checks (e.g., null inputs, invalid `k`/`threshold`) beyond LeetCode constraints.

