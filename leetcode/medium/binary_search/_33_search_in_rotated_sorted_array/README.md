# 33. Search in Rotated Sorted Array

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/binary_search/33_search_in_rotated_sorted_array`
- Folder Name: `33_search_in_rotated_sorted_array`
- Official Link: https://leetcode.com/problems/search-in-rotated-sorted-array/

## Problem Overview
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly left rotated at an unknown index k ( 1 ) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] ( 0-indexed ). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2] .

## Java Starter Signature
```java
public int search(int[] nums, int target)
```

## Suggested Test Cases
1. `nums = [4,5,6,7,0,1,2], target = 0` -> `4`
2. `nums = [4,5,6,7,0,1,2], target = 3` -> `-1`
3. `nums = [1], target = 0` -> `-1`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SearchInRotatedSortedArray.java` contains the correct class name and Java method signature.
- `SearchInRotatedSortedArrayTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SearchInRotatedSortedArray.java` - blank Java starter solution
- `SearchInRotatedSortedArrayTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
