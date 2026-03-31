# 329. Longest Increasing Path in a Matrix

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/matrix/329_longest_increasing_path_in_a_matrix`
- Folder Name: `329_longest_increasing_path_in_a_matrix`
- Official Link: https://leetcode.com/problems/longest-increasing-path-in-a-matrix/

## Problem Overview
You are given an m x n integers matrix , return the length of the longest increasing path in matrix .
From each cell, you can either move in four directions: left, right, up, or down. You may not move diagonally or move outside the boundary (i.e., wrap-around is not allowed).

## Java Starter Signature
```java
public int longestIncreasingPath(int[][] matrix)
```

## Suggested Test Cases
1. `matrix = [[9,9,4],[6,6,8],[2,1,1]]` -> `4`
2. `matrix = [[3,4,5],[3,2,6],[2,2,1]]` -> `4`
3. `matrix = [[1]]` -> `1`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LongestIncreasingPathInAMatrix.java` contains the correct class name and Java method signature.
- `LongestIncreasingPathInAMatrixTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LongestIncreasingPathInAMatrix.java` - blank Java starter solution
- `LongestIncreasingPathInAMatrixTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
