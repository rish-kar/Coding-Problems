# 90. Subsets II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Backtracking
- Folder Path: `leetcode/medium/backtracking/90_subsets_ii`
- Folder Name: `90_subsets_ii`
- Official Link: https://leetcode.com/problems/subsets-ii/

## Problem Overview
Return all unique subsets when the input may contain duplicates.

## Java Starter Signature
```java
public List<List<Integer>> subsetsWithDup(int[] nums)
```


## Suggested Test Cases
1. `nums = [1,2,2] -> unique subsets`
2. `nums = [0] -> [[],[0]]`
3. `nums = [4,4,4,1,4] -> unique subsets without repetition`

## What To Watch For
- Define the stopping condition first so you know exactly when to record an answer.
- Undo each choice after the recursive call so the next branch starts cleanly.
- If duplicates are possible, decide where to prune them before recursion explodes.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SubsetsII.java` contains the correct class name and Java method signature.
- `SubsetsIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SubsetsII.java` - blank Java starter solution
- `SubsetsIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
