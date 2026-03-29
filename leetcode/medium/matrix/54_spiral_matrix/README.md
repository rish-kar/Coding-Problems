# 54. Spiral Matrix

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/matrix/54_spiral_matrix`
- Folder Name: `54_spiral_matrix`
- Official Link: https://leetcode.com/problems/spiral-matrix/

## Problem Overview
You are given an m x n matrix , return all elements of the matrix in spiral order .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public List<Integer> spiralOrder(int[][] matrix)
```

## Suggested Test Cases
1. `matrix = [[1,2,3],[4,5,6],[7,8,9]]` -> `[1,2,3,6,9,8,7,4,5]`
2. `matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]` -> `[1,2,3,4,8,12,11,10,9,5,6,7]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SpiralMatrix.java` contains the correct class name and Java method signature.
- `SpiralMatrixTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SpiralMatrix.java` - blank Java starter solution
- `SpiralMatrixTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
