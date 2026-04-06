# 81. Search in Rotated Sorted Array II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/binary_search/81_search_in_rotated_sorted_array_ii`
- Folder Name: `81_search_in_rotated_sorted_array_ii`
- Official Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

## Problem Overview
There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
Before being passed to your function, nums is rotated at an unknown pivot index k ( 0 ) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] ( 0-indexed ). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4] .

## Java Starter Signature
```java
public boolean search(int[] nums, int target)
```

## Suggested Test Cases
1. `nums = [2,5,6,0,0,1,2], target = 0` -> `true`
2. `nums = [2,5,6,0,0,1,2], target = 3` -> `false`
3. `nums = []` -> `false`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SearchInRotatedSortedArrayII.java` contains the correct class name and Java method signature.
- `SearchInRotatedSortedArrayIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SearchInRotatedSortedArrayII.java` - blank Java starter solution
- `SearchInRotatedSortedArrayIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
