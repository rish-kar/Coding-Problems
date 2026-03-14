# 18. 4Sum

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Two Pointers
- Folder Path: `leetcode/medium/two_pointers/18_4sum`
- Folder Name: `18_4sum`
- Official Link: https://leetcode.com/problems/4sum/

## Problem Overview
Return all unique quadruplets whose sum equals the target.

## Java Starter Signature
```java
public List<List<Integer>> fourSum(int[] nums, int target)
```


## Suggested Test Cases
1. `nums = [1,0,-1,0,-2,2], target = 0 -> unique quadruplets`
2. `nums = [2,2,2,2,2], target = 8 -> [[2,2,2,2]]`
3. `nums = [0,0,0,0], target = 0 -> [[0,0,0,0]]`

## What To Watch For
- Move the pointer that can actually improve the answer instead of advancing both blindly.
- Sorted input often enables duplicate skipping and targeted pointer motion.
- Test very small inputs because pointer crossings are a common source of bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `FourSum.java` contains the correct class name and Java method signature.
- `FourSumTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `FourSum.java` - blank Java starter solution
- `FourSumTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
