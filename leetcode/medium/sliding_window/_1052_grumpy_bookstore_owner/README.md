# 1052. Grumpy Bookstore Owner

**Difficulty:** Medium  
**Link:** https://leetcode.com/problems/grumpy-bookstore-owner/

## Problem
You are given two integer arrays of the same length:
- `customers[i]`: number of customers entering at minute `i`
- `grumpy[i]`: whether the owner is grumpy at minute `i` (`1`) or not (`0`)

When the owner is not grumpy, all customers at that minute are satisfied.

The owner can choose a consecutive window of length `minutes` during which they are not grumpy.
Return the **maximum number of satisfied customers**.

## Approach (Sliding Window)
- First compute the baseline satisfied customers: sum of `customers[i]` where `grumpy[i] == 0`.
- Then use a sliding window of size `minutes` to compute the extra customers that would become satisfied if we suppress grumpiness in that window (only count positions with `grumpy[i] == 1`).
- Answer = baseline + maximum extra window gain.

## Complexity
- **Time:** `O(n)`
- **Space:** `O(1)`

## Notes
This implementation includes some defensive argument checks that bypass LeetCode constraints.

