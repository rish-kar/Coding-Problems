# 713. Subarray Product Less Than K

**Difficulty:** Medium  
**Topic:** Sliding Window

## Problem Summary
Given an integer array `nums` and an integer `k`, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than `k`.

## Approach
Use a sliding window with a running product:
- Expand the right edge and multiply by the new value.
- While the product is `>= k`, shrink from the left.
- For each position, count all valid subarrays ending at `right`.

## Complexity
- Time: `O(n)`
- Space: `O(1)`

## Files
- `SubarrayProductLessThanK.java`
- `SubarrayProductLessThanKTest.java`

