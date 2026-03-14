# 46. Permutations

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Backtracking
- Folder Path: `leetcode/medium/backtracking/46_permutations`
- Folder Name: `46_permutations`
- Official Link: https://leetcode.com/problems/permutations/

## Problem Overview
Return every possible ordering of the distinct values.

## Java Starter Signature
```java
public List<List<Integer>> permute(int[] nums)
```


## Suggested Test Cases
1. `nums = [1,2,3] -> 6 permutations`
2. `nums = [0,1] -> [[0,1],[1,0]]`
3. `nums = [1] -> [[1]]`

## What To Watch For
- Define the stopping condition first so you know exactly when to record an answer.
- Undo each choice after the recursive call so the next branch starts cleanly.
- If duplicates are possible, decide where to prune them before recursion explodes.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `Permutations.java` contains the correct class name and Java method signature.
- `PermutationsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `Permutations.java` - blank Java starter solution
- `PermutationsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
