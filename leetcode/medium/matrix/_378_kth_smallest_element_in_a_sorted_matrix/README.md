# 378. Kth Smallest Element in a Sorted Matrix

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/matrix/378_kth_smallest_element_in_a_sorted_matrix`
- Folder Name: `378_kth_smallest_element_in_a_sorted_matrix`
- Official Link: https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/

## Problem Overview
You are given an n x n matrix where each of the rows and columns is sorted in ascending order, return the k th smallest element in the matrix .
Note that it is the k th smallest element in the sorted order , not the k th distinct element.

## Java Starter Signature
```java
public int kthSmallest(int[][] matrix, int k)
```

## Suggested Test Cases
1. `matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8` -> `13`
2. `matrix = [[-5]], k = 1` -> `-5`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `KthSmallestElementInASortedMatrix.java` contains the correct class name and Java method signature.
- `KthSmallestElementInASortedMatrixTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `KthSmallestElementInASortedMatrix.java` - blank Java starter solution
- `KthSmallestElementInASortedMatrixTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
