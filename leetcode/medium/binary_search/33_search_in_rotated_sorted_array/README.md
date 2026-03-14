# 33. Search in Rotated Sorted Array

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Search
- Folder Path: `leetcode/medium/binary_search/33_search_in_rotated_sorted_array`
- Folder Name: `33_search_in_rotated_sorted_array`
- Official Link: https://leetcode.com/problems/search-in-rotated-sorted-array/

## Problem Overview
Search for the target in a rotated sorted array and return its index, or -1 if it is absent.

## Java Starter Signature
```java
public int search(int[] nums, int target)
```


## Suggested Test Cases
1. `nums = [4,5,6,7,0,1,2], target = 0 -> 4`
2. `nums = [4,5,6,7,0,1,2], target = 3 -> -1`
3. `nums = [1], target = 0 -> -1`

## What To Watch For
- Decide whether the interval is closed or half-open and keep that rule consistent.
- Midpoint and boundary updates should always shrink the search space.
- When the loop ends, confirm whether the answer is a found index or an insertion boundary.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SearchInRotatedSortedArray.java` contains the correct class name and Java method signature.
- `SearchInRotatedSortedArrayTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SearchInRotatedSortedArray.java` - blank Java starter solution
- `SearchInRotatedSortedArrayTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
