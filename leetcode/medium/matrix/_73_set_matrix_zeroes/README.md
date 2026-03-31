# 73. Set Matrix Zeroes

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/matrix/73_set_matrix_zeroes`
- Folder Name: `73_set_matrix_zeroes`
- Official Link: https://leetcode.com/problems/set-matrix-zeroes/

## Problem Overview
You are given an m x n integer matrix matrix , if an element is 0 , set its entire row and column to 0 's.
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public void setZeroes(int[][] matrix)
```

## Suggested Test Cases
1. `matrix = [[1,1,1],[1,0,1],[1,1,1]]` -> `[[1,0,1],[0,0,0],[1,0,1]]`
2. `matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]` -> `[[0,0,0,0],[0,4,5,0],[0,3,1,0]]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SetMatrixZeroes.java` contains the correct class name and Java method signature.
- `SetMatrixZeroesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SetMatrixZeroes.java` - blank Java starter solution
- `SetMatrixZeroesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
