# 81. Search in Rotated Sorted Array II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Search
- Folder Path: `leetcode/medium/binary_search/81_search_in_rotated_sorted_array_ii`
- Folder Name: `81_search_in_rotated_sorted_array_ii`
- Official Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

## Problem Overview
Return whether the target exists in the rotated sorted array that may contain duplicates.

## Java Starter Signature
```java
public boolean search(int[] nums, int target)
```


## Suggested Test Cases
1. `nums = [2,5,6,0,0,1,2], target = 0 -> true`
2. `nums = [2,5,6,0,0,1,2], target = 3 -> false`
3. `nums = [1,0,1,1,1], target = 0 -> true`

## What To Watch For
- Decide whether the interval is closed or half-open and keep that rule consistent.
- Midpoint and boundary updates should always shrink the search space.
- When the loop ends, confirm whether the answer is a found index or an insertion boundary.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SearchInRotatedSortedArrayII.java` contains the correct class name and Java method signature.
- `SearchInRotatedSortedArrayIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SearchInRotatedSortedArrayII.java` - blank Java starter solution
- `SearchInRotatedSortedArrayIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
