# 88. Merge Sorted Array

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/arrays/88_merge_sorted_array`
- Folder Name: `88_merge_sorted_array`
- Official Link: https://leetcode.com/problems/merge-sorted-array/

## Problem Overview
You are given two integer arrays nums1 and nums2 , sorted in non-decreasing order , and two integers m and n , representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order .

## Java Starter Signature
```java
public void merge(int[] nums1, int m, int[] nums2, int n)
```

## Suggested Test Cases
1. `nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3` -> `[1,2,2,3,5,6]`
2. `nums1 = [1], m = 1, nums2 = [], n = 0` -> `[1]`
3. `nums1 = [0], m = 0, nums2 = [1], n = 1` -> `[1]`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MergeSortedArray.java` contains the correct class name and Java method signature.
- `MergeSortedArrayTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MergeSortedArray.java` - blank Java starter solution
- `MergeSortedArrayTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
