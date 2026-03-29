# 240. Search a 2D Matrix II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/binary_search/240_search_a_2d_matrix_ii`
- Folder Name: `240_search_a_2d_matrix_ii`
- Official Link: https://leetcode.com/problems/search-a-2d-matrix-ii/

## Problem Overview
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix . This matrix has the following properties
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public boolean searchMatrix(int[][] matrix, int target)
```

## Suggested Test Cases
1. `matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5` -> `true`
2. `matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20` -> `false`
3. `nums = []` -> `false`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SearchATwoDMatrixII.java` contains the correct class name and Java method signature.
- `SearchATwoDMatrixIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SearchATwoDMatrixII.java` - blank Java starter solution
- `SearchATwoDMatrixIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
