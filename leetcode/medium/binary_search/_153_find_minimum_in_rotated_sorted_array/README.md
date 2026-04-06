# 153. Find Minimum in Rotated Sorted Array

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/binary_search/153_find_minimum_in_rotated_sorted_array`
- Folder Name: `153_find_minimum_in_rotated_sorted_array`
- Official Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

## Problem Overview
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]] .

## Java Starter Signature
```java
public int findMin(int[] nums)
```

## Suggested Test Cases
1. `nums = [3,4,5,1,2]` -> `1`
2. `nums = [4,5,6,7,0,1,2]` -> `0`
3. `nums = [11,13,15,17]` -> `11`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `FindMinimumInRotatedSortedArray.java` contains the correct class name and Java method signature.
- `FindMinimumInRotatedSortedArrayTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `FindMinimumInRotatedSortedArray.java` - blank Java starter solution
- `FindMinimumInRotatedSortedArrayTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
