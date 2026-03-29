# 18. 4Sum

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/two_pointers/18_4sum`
- Folder Name: `18_4sum`
- Official Link: https://leetcode.com/problems/4sum/

## Problem Overview
You are given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that
You may return the answer in any order .

## Java Starter Signature
```java
public List<List<Integer>> fourSum(int[] nums, int target)
```

## Suggested Test Cases
1. `nums = [1,0,-1,0,-2,2], target = 0` -> `[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]`
2. `nums = [2,2,2,2,2], target = 8` -> `[[2,2,2,2]]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `FourSum.java` contains the correct class name and Java method signature.
- `FourSumTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `FourSum.java` - blank Java starter solution
- `FourSumTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
