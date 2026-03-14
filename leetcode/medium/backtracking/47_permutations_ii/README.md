# 47. Permutations II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Backtracking
- Folder Path: `leetcode/medium/backtracking/47_permutations_ii`
- Folder Name: `47_permutations_ii`
- Official Link: https://leetcode.com/problems/permutations-ii/

## Problem Overview
Return all unique permutations when the input may contain duplicates.

## Java Starter Signature
```java
public List<List<Integer>> permuteUnique(int[] nums)
```


## Suggested Test Cases
1. `nums = [1,1,2] -> unique permutations`
2. `nums = [1,2,3] -> 6 permutations`
3. `nums = [2,2,1,1] -> unique permutations without repeats`

## What To Watch For
- Define the stopping condition first so you know exactly when to record an answer.
- Undo each choice after the recursive call so the next branch starts cleanly.
- If duplicates are possible, decide where to prune them before recursion explodes.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PermutationsII.java` contains the correct class name and Java method signature.
- `PermutationsIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PermutationsII.java` - blank Java starter solution
- `PermutationsIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
