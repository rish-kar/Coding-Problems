# 1. Two Sum

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/hash_map/1_two_sum`
- Folder Name: `1_two_sum`
- Official Link: https://leetcode.com/problems/two-sum/

## Problem Overview
You are given an array of integers nums and an integer target , return indices of the two numbers such that they add up to target .
You may assume that each input would have exactly one solution , and you may not use the same element twice.

## Java Starter Signature
```java
public int[] twoSum(int[] nums, int target)
```

## Suggested Test Cases
1. `nums = [2,7,11,15], target = 9` -> `[0,1]`
2. `nums = [3,2,4], target = 6` -> `[1,2]`
3. `nums = [3,3], target = 6` -> `[0,1]`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `TwoSum.java` contains the correct class name and Java method signature.
- `TwoSumTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `TwoSum.java` - blank Java starter solution
- `TwoSumTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
