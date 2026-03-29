# 4. Median of Two Sorted Arrays

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/binary_search/4_median_of_two_sorted_arrays`
- Folder Name: `4_median_of_two_sorted_arrays`
- Official Link: https://leetcode.com/problems/median-of-two-sorted-arrays/

## Problem Overview
You are given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)) .

## Java Starter Signature
```java
public double findMedianSortedArrays(int[] nums1, int[] nums2)
```

## Suggested Test Cases
1. `nums1 = [1,3], nums2 = [2]` -> `2.00000`
2. `nums1 = [1,2], nums2 = [3,4]` -> `2.50000`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MedianOfTwoSortedArrays.java` contains the correct class name and Java method signature.
- `MedianOfTwoSortedArraysTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MedianOfTwoSortedArrays.java` - blank Java starter solution
- `MedianOfTwoSortedArraysTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
