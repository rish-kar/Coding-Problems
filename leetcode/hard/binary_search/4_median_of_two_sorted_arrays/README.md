# 4. Median of Two Sorted Arrays

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Binary Search
- Folder Path: `leetcode/hard/binary_search/4_median_of_two_sorted_arrays`
- Folder Name: `4_median_of_two_sorted_arrays`
- Official Link: https://leetcode.com/problems/median-of-two-sorted-arrays/

## Problem Overview
Find the median value after combining two sorted arrays without fully merging them in a slow way.

## Java Starter Signature
```java
public double findMedianSortedArrays(int[] nums1, int[] nums2)
```


## Suggested Test Cases
1. `nums1 = [1,3], nums2 = [2] -> 2.0`
2. `nums1 = [1,2], nums2 = [3,4] -> 2.5`
3. `nums1 = [0,0], nums2 = [0,0] -> 0.0`

## What To Watch For
- Decide whether the interval is closed or half-open and keep that rule consistent.
- Midpoint and boundary updates should always shrink the search space.
- When the loop ends, confirm whether the answer is a found index or an insertion boundary.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MedianOfTwoSortedArrays.java` contains the correct class name and Java method signature.
- `MedianOfTwoSortedArraysTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MedianOfTwoSortedArrays.java` - blank Java starter solution
- `MedianOfTwoSortedArraysTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
