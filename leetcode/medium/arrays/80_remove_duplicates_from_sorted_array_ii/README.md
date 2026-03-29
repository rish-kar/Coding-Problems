# 80. Remove Duplicates from Sorted Array II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/80_remove_duplicates_from_sorted_array_ii`
- Folder Name: `80_remove_duplicates_from_sorted_array_ii`
- Official Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

## Problem Overview
You are given an integer array nums sorted in non-decreasing order , remove some duplicates in-place such that each unique element appears at most twice . The relative order of the elements should be kept the same .
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums . More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

## Java Starter Signature
```java
public int removeDuplicates(int[] nums)
```

## Suggested Test Cases
1. `nums = [1,1,1,2,2,3]` -> `5, nums = [1,1,2,2,3,_]`
2. `nums = [0,0,1,1,1,1,2,3,3]` -> `7, nums = [0,0,1,1,2,3,3,_,_]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RemoveDuplicatesFromSortedArrayII.java` contains the correct class name and Java method signature.
- `RemoveDuplicatesFromSortedArrayIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RemoveDuplicatesFromSortedArrayII.java` - blank Java starter solution
- `RemoveDuplicatesFromSortedArrayIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
