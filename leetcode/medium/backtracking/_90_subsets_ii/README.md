# 90. Subsets II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/backtracking/90_subsets_ii`
- Folder Name: `90_subsets_ii`
- Official Link: https://leetcode.com/problems/subsets-ii/

## Problem Overview
You are given an integer array nums that may contain duplicates, return all possible subsets (the power set) .
The solution set must not contain duplicate subsets. Then return the solution in any order .

## Java Starter Signature
```java
public List<List<Integer>> subsetsWithDup(int[] nums)
```

## Suggested Test Cases
1. `nums = [1,2,2]` -> `[[],[1],[1,2],[1,2,2],[2],[2,2]]`
2. `nums = [0]` -> `[[],[0]]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SubsetsII.java` contains the correct class name and Java method signature.
- `SubsetsIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SubsetsII.java` - blank Java starter solution
- `SubsetsIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
