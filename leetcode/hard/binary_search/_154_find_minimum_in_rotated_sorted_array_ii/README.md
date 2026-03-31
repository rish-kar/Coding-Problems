# 154. Find Minimum in Rotated Sorted Array II

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/binary_search/154_find_minimum_in_rotated_sorted_array_ii`
- Folder Name: `154_find_minimum_in_rotated_sorted_array_ii`
- Official Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

## Problem Overview
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,4,4,5,6,7] might become
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]] .

## Java Starter Signature
```java
public int findMin(int[] nums)
```

## Suggested Test Cases
1. `nums = [1,3,5]` -> `1`
2. `nums = [2,2,2,0,1]` -> `0`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `FindMinimumInRotatedSortedArrayII.java` contains the correct class name and Java method signature.
- `FindMinimumInRotatedSortedArrayIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `FindMinimumInRotatedSortedArrayII.java` - blank Java starter solution
- `FindMinimumInRotatedSortedArrayIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
