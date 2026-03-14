# 54. Spiral Matrix

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Matrix
- Folder Path: `leetcode/medium/matrix/54_spiral_matrix`
- Folder Name: `54_spiral_matrix`
- Official Link: https://leetcode.com/problems/spiral-matrix/

## Problem Overview
Return the matrix elements in spiral order.

## Java Starter Signature
```java
public List<Integer> spiralOrder(int[][] matrix)
```


## Suggested Test Cases
1. `matrix = [[1,2,3],[4,5,6],[7,8,9]] -> [1,2,3,6,9,8,7,4,5]`
2. `matrix = [[1,2,3,4]] -> [1,2,3,4]`
3. `matrix = [[1],[2],[3]] -> [1,2,3]`

## What To Watch For
- Always keep row and column bounds separate so rectangular inputs still work.
- If you mutate the matrix in place, decide which cells can safely act as markers.
- Traversal problems usually need a clear visited rule or shrinking boundary rule.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SpiralMatrix.java` contains the correct class name and Java method signature.
- `SpiralMatrixTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SpiralMatrix.java` - blank Java starter solution
- `SpiralMatrixTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
