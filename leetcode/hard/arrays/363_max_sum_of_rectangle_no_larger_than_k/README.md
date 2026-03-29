# 363. Max Sum of Rectangle No Larger Than K

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/arrays/363_max_sum_of_rectangle_no_larger_than_k`
- Folder Name: `363_max_sum_of_rectangle_no_larger_than_k`
- Official Link: https://leetcode.com/problems/max-sum-of-rectangle-no-larger-than-k/

## Problem Overview
You are given an m x n matrix matrix and an integer k , return the max sum of a rectangle in the matrix such that its sum is no larger than k .
It is guaranteed that there will be a rectangle with a sum no larger than k .

## Java Starter Signature
```java
public int maxSumSubmatrix(int[][] matrix, int k)
```

## Suggested Test Cases
1. `matrix = [[1,0,1],[0,-2,3]], k = 2` -> `2`
2. `matrix = [[2,2,-1]], k = 3` -> `3`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MaxSumOfRectangleNoLargerThanK.java` contains the correct class name and Java method signature.
- `MaxSumOfRectangleNoLargerThanKTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MaxSumOfRectangleNoLargerThanK.java` - blank Java starter solution
- `MaxSumOfRectangleNoLargerThanKTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
