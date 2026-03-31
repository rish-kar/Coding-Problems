# 26. Remove Duplicates from Sorted Array

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/arrays/26_remove_duplicates_from_sorted_array`
- Folder Name: `26_remove_duplicates_from_sorted_array`
- Official Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

## Problem Overview
You are given an integer array nums sorted in non-decreasing order , remove the duplicates in-place such that each unique element appears only once . The relative order of the elements should be kept the same .
Consider the number of unique elements in nums to be k ​​​​​​​ ​​​​​​​. After removing duplicates, return the number of unique elements k .

## Java Starter Signature
```java
public int removeDuplicates(int[] nums)
```

## Suggested Test Cases
1. `nums = [1,1,2]` -> `2, nums = [1,2,_]`
2. `nums = [0,0,1,1,1,2,2,3,3,4]` -> `5, nums = [0,1,2,3,4,_,_,_,_,_]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RemoveDuplicatesFromSortedArray.java` contains the correct class name and Java method signature.
- `RemoveDuplicatesFromSortedArrayTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RemoveDuplicatesFromSortedArray.java` - blank Java starter solution
- `RemoveDuplicatesFromSortedArrayTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
