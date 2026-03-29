# 64. Minimum Path Sum

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/dynamic_programming/64_minimum_path_sum`
- Folder Name: `64_minimum_path_sum`
- Official Link: https://leetcode.com/problems/minimum-path-sum/

## Problem Overview
You are given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.
Note: You can only move either down or right at any point in time.

## Java Starter Signature
```java
public int minPathSum(int[][] grid)
```

## Suggested Test Cases
1. `grid = [[1,3,1],[1,5,1],[4,2,1]]` -> `7`
2. `grid = [[1,2,3],[4,5,6]]` -> `12`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MinimumPathSum.java` contains the correct class name and Java method signature.
- `MinimumPathSumTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MinimumPathSum.java` - blank Java starter solution
- `MinimumPathSumTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
