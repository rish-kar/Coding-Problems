# 39. Combination Sum

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/backtracking/39_combination_sum`
- Folder Name: `39_combination_sum`
- Official Link: https://leetcode.com/problems/combination-sum/

## Problem Overview
You are given an array of distinct integers candidates and a target integer target , return a list of all unique combinations of candidates where the chosen numbers sum to target . You may return the combinations in any order .
The same number may be chosen from candidates an unlimited number of times . Two combinations are unique if the frequency of at least one of the chosen numbers is different.

## Java Starter Signature
```java
public List<List<Integer>> combinationSum(int[] candidates, int target)
```

## Suggested Test Cases
1. `candidates = [2,3,6,7], target = 7` -> `[[2,2,3],[7]]`
2. `candidates = [2,3,5], target = 8` -> `[[2,2,2,2],[2,3,3],[3,5]]`
3. `candidates = [2], target = 1` -> `[]`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `CombinationSum.java` contains the correct class name and Java method signature.
- `CombinationSumTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `CombinationSum.java` - blank Java starter solution
- `CombinationSumTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
