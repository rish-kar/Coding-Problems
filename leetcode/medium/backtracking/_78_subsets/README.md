# 78. Subsets

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/backtracking/78_subsets`
- Folder Name: `78_subsets`
- Official Link: https://leetcode.com/problems/subsets/

## Problem Overview
You are given an integer array nums of unique elements, return all possible subsets (the power set) .
The solution set must not contain duplicate subsets. Then return the solution in any order .

## Java Starter Signature
```java
public List<List<Integer>> subsets(int[] nums)
```

## Suggested Test Cases
1. `nums = [1,2,3]` -> `[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]`
2. `nums = [0]` -> `[[],[0]]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `Subsets.java` contains the correct class name and Java method signature.
- `SubsetsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `Subsets.java` - blank Java starter solution
- `SubsetsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
