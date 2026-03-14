# 39. Combination Sum

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Backtracking
- Folder Path: `leetcode/medium/backtracking/39_combination_sum`
- Folder Name: `39_combination_sum`
- Official Link: https://leetcode.com/problems/combination-sum/

## Problem Overview
Return all unique combinations where candidates can be reused and the chosen values add up to the target.

## Java Starter Signature
```java
public List<List<Integer>> combinationSum(int[] candidates, int target)
```


## Suggested Test Cases
1. `candidates = [2,3,6,7], target = 7 -> [[2,2,3],[7]]`
2. `candidates = [2,3,5], target = 8 -> [[2,2,2,2],[2,3,3],[3,5]]`
3. `candidates = [2], target = 1 -> []`

## What To Watch For
- Define the stopping condition first so you know exactly when to record an answer.
- Undo each choice after the recursive call so the next branch starts cleanly.
- If duplicates are possible, decide where to prune them before recursion explodes.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `CombinationSum.java` contains the correct class name and Java method signature.
- `CombinationSumTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `CombinationSum.java` - blank Java starter solution
- `CombinationSumTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
