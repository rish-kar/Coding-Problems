# 59. Spiral Matrix II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/matrix/59_spiral_matrix_ii`
- Folder Name: `59_spiral_matrix_ii`
- Official Link: https://leetcode.com/problems/spiral-matrix-ii/

## Problem Overview
You are given a positive integer n , generate an n x n matrix filled with elements from 1 to n 2 in spiral order.
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int[][] generateMatrix(int n)
```

## Suggested Test Cases
1. `n = 3` -> `[[1,2,3],[8,9,4],[7,6,5]]`
2. `n = 1` -> `[[1]]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SpiralMatrixII.java` contains the correct class name and Java method signature.
- `SpiralMatrixIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SpiralMatrixII.java` - blank Java starter solution
- `SpiralMatrixIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
