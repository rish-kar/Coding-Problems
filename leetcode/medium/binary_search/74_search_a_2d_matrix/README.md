# 74. Search a 2D Matrix

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Search
- Folder Path: `leetcode/medium/binary_search/74_search_a_2d_matrix`
- Folder Name: `74_search_a_2d_matrix`
- Official Link: https://leetcode.com/problems/search-a-2d-matrix/

## Problem Overview
Search for the target in a matrix whose rows behave like a sorted flattened array.

## Java Starter Signature
```java
public boolean searchMatrix(int[][] matrix, int target)
```


## Suggested Test Cases
1. `matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3 -> true`
2. `same matrix, target = 13 -> false`
3. `a 1x1 matrix should still work`

## What To Watch For
- Decide whether the interval is closed or half-open and keep that rule consistent.
- Midpoint and boundary updates should always shrink the search space.
- When the loop ends, confirm whether the answer is a found index or an insertion boundary.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SearchA2DMatrix.java` contains the correct class name and Java method signature.
- `SearchA2DMatrixTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SearchA2DMatrix.java` - blank Java starter solution
- `SearchA2DMatrixTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
