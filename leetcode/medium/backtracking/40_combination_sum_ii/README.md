# 40. Combination Sum II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Backtracking
- Folder Path: `leetcode/medium/backtracking/40_combination_sum_ii`
- Folder Name: `40_combination_sum_ii`
- Official Link: https://leetcode.com/problems/combination-sum-ii/

## Problem Overview
Return all unique combinations that add up to the target when each candidate may be used at most once.

## Java Starter Signature
```java
public List<List<Integer>> combinationSum2(int[] candidates, int target)
```


## Suggested Test Cases
1. `candidates = [10,1,2,7,6,1,5], target = 8 -> unique combinations`
2. `candidates = [2,5,2,1,2], target = 5 -> [[1,2,2],[5]]`
3. `candidates = [1,1,1,2], target = 3 -> [[1,1,1],[1,2]]`

## What To Watch For
- Define the stopping condition first so you know exactly when to record an answer.
- Undo each choice after the recursive call so the next branch starts cleanly.
- If duplicates are possible, decide where to prune them before recursion explodes.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `CombinationSumII.java` contains the correct class name and Java method signature.
- `CombinationSumIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `CombinationSumII.java` - blank Java starter solution
- `CombinationSumIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
