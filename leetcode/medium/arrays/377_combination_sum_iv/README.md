# 377. Combination Sum IV

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/377_combination_sum_iv`
- Folder Name: `377_combination_sum_iv`
- Official Link: https://leetcode.com/problems/combination-sum-iv/

## Problem Overview
You are given an array of distinct integers nums and a target integer target , return the number of possible combinations that add up to target .
The test cases are generated so that the answer can fit in a 32-bit integer.

## Java Starter Signature
```java
public int combinationSum4(int[] nums, int target)
```

## Suggested Test Cases
1. `nums = [1,2,3], target = 4` -> `7`
2. `nums = [9], target = 3` -> `0`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `CombinationSumIV.java` contains the correct class name and Java method signature.
- `CombinationSumIVTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `CombinationSumIV.java` - blank Java starter solution
- `CombinationSumIVTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
