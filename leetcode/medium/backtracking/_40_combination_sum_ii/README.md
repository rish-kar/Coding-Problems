# 40. Combination Sum II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/backtracking/40_combination_sum_ii`
- Folder Name: `40_combination_sum_ii`
- Official Link: https://leetcode.com/problems/combination-sum-ii/

## Problem Overview
You are given a collection of candidate numbers ( candidates ) and a target number ( target ), find all unique combinations in candidates where the candidate numbers sum to target .
Each number in candidates may only be used once in the combination.

## Java Starter Signature
```java
public List<List<Integer>> combinationSum2(int[] candidates, int target)
```

## Suggested Test Cases
1. `candidates = [10,1,2,7,6,1,5], target = 8` -> `[ [1,1,6], [1,2,5], [1,7], [2,6] ]`
2. `candidates = [2,5,2,1,2], target = 5` -> `[ [1,2,2], [5] ]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `CombinationSumII.java` contains the correct class name and Java method signature.
- `CombinationSumIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `CombinationSumII.java` - blank Java starter solution
- `CombinationSumIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
