# 74. Search a 2D Matrix

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/binary_search/74_search_a_2d_matrix`
- Folder Name: `74_search_a_2d_matrix`
- Official Link: https://leetcode.com/problems/search-a-2d-matrix/

## Problem Overview
You are given an m x n integer matrix matrix with the following two properties
You are given an integer target , return true if target is in matrix or false otherwise .

## Java Starter Signature
```java
public boolean searchMatrix(int[][] matrix, int target)
```

## Suggested Test Cases
1. `matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3` -> `true`
2. `matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13` -> `false`
3. `nums = []` -> `false`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SearchATwoDMatrix.java` contains the correct class name and Java method signature.
- `SearchATwoDMatrixTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SearchATwoDMatrix.java` - blank Java starter solution
- `SearchATwoDMatrixTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
