# 34. Find First and Last Position of Element in Sorted Array

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/binary_search/34_find_first_and_last_position_of_element_in_sorted_array`
- Folder Name: `34_find_first_and_last_position_of_element_in_sorted_array`
- Official Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

## Problem Overview
You are given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1] .

## Java Starter Signature
```java
public int[] searchRange(int[] nums, int target)
```

## Suggested Test Cases
1. `nums = [5,7,7,8,8,10], target = 8` -> `[3,4]`
2. `nums = [5,7,7,8,8,10], target = 6` -> `[-1,-1]`
3. `nums = [], target = 0` -> `[-1,-1]`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `FindFirstAndLastPositionOfElementInSortedArray.java` contains the correct class name and Java method signature.
- `FindFirstAndLastPositionOfElementInSortedArrayTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `FindFirstAndLastPositionOfElementInSortedArray.java` - blank Java starter solution
- `FindFirstAndLastPositionOfElementInSortedArrayTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
