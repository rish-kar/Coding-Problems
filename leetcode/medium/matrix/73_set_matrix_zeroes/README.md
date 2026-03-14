# 73. Set Matrix Zeroes

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Matrix
- Folder Path: `leetcode/medium/matrix/73_set_matrix_zeroes`
- Folder Name: `73_set_matrix_zeroes`
- Official Link: https://leetcode.com/problems/set-matrix-zeroes/

## Problem Overview
If any cell is zero, set its entire row and column to zero in place.

## Java Starter Signature
```java
public void setZeroes(int[][] matrix)
```


## Suggested Test Cases
1. `matrix = [[1,1,1],[1,0,1],[1,1,1]] -> [[1,0,1],[0,0,0],[1,0,1]]`
2. `matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]] -> row and column zeroing`
3. `a matrix with no zeroes remains unchanged`

## What To Watch For
- Always keep row and column bounds separate so rectangular inputs still work.
- If you mutate the matrix in place, decide which cells can safely act as markers.
- Traversal problems usually need a clear visited rule or shrinking boundary rule.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SetMatrixZeroes.java` contains the correct class name and Java method signature.
- `SetMatrixZeroesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SetMatrixZeroes.java` - blank Java starter solution
- `SetMatrixZeroesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
