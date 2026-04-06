# 350. Intersection of Two Arrays II

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/arrays/350_intersection_of_two_arrays_ii`
- Folder Name: `350_intersection_of_two_arrays_ii`
- Official Link: https://leetcode.com/problems/intersection-of-two-arrays-ii/

## Problem Overview
You are given two integer arrays nums1 and nums2 , return an array of their intersection . Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int[] intersect(int[] nums1, int[] nums2)
```

## Suggested Test Cases
1. `nums1 = [1,2,2,1], nums2 = [2,2]` -> `[2,2]`
2. `nums1 = [4,9,5], nums2 = [9,4,9,8,4]` -> `[4,9]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `IntersectionOfTwoArraysII.java` contains the correct class name and Java method signature.
- `IntersectionOfTwoArraysIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `IntersectionOfTwoArraysII.java` - blank Java starter solution
- `IntersectionOfTwoArraysIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
