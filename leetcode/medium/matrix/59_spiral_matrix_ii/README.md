# 59. Spiral Matrix II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Matrix
- Folder Path: `leetcode/medium/matrix/59_spiral_matrix_ii`
- Folder Name: `59_spiral_matrix_ii`
- Official Link: https://leetcode.com/problems/spiral-matrix-ii/

## Problem Overview
Generate an n by n matrix filled with 1 through n squared in spiral order.

## Java Starter Signature
```java
public int[][] generateMatrix(int n)
```


## Suggested Test Cases
1. `n = 3 -> [[1,2,3],[8,9,4],[7,6,5]]`
2. `n = 1 -> [[1]]`
3. `n = 4 -> spiral values from 1 to 16`

## What To Watch For
- Always keep row and column bounds separate so rectangular inputs still work.
- If you mutate the matrix in place, decide which cells can safely act as markers.
- Traversal problems usually need a clear visited rule or shrinking boundary rule.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SpiralMatrixII.java` contains the correct class name and Java method signature.
- `SpiralMatrixIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SpiralMatrixII.java` - blank Java starter solution
- `SpiralMatrixIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
