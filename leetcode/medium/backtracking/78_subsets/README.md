# 78. Subsets

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Backtracking
- Folder Path: `leetcode/medium/backtracking/78_subsets`
- Folder Name: `78_subsets`
- Official Link: https://leetcode.com/problems/subsets/

## Problem Overview
Return the power set of the distinct input values.

## Java Starter Signature
```java
public List<List<Integer>> subsets(int[] nums)
```


## Suggested Test Cases
1. `nums = [1,2,3] -> 8 subsets`
2. `nums = [0] -> [[],[0]]`
3. `nums = [1,2] -> 4 subsets`

## What To Watch For
- Define the stopping condition first so you know exactly when to record an answer.
- Undo each choice after the recursive call so the next branch starts cleanly.
- If duplicates are possible, decide where to prune them before recursion explodes.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `Subsets.java` contains the correct class name and Java method signature.
- `SubsetsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `Subsets.java` - blank Java starter solution
- `SubsetsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
