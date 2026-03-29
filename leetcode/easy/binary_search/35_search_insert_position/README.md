# 35. Search Insert Position

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/binary_search/35_search_insert_position`
- Folder Name: `35_search_insert_position`
- Official Link: https://leetcode.com/problems/search-insert-position/

## Problem Overview
You are given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

## Java Starter Signature
```java
public int searchInsert(int[] nums, int target)
```

## Suggested Test Cases
1. `nums = [1,3,5,6], target = 5` -> `2`
2. `nums = [1,3,5,6], target = 2` -> `1`
3. `nums = [1,3,5,6], target = 7` -> `4`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SearchInsertPosition.java` contains the correct class name and Java method signature.
- `SearchInsertPositionTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SearchInsertPosition.java` - blank Java starter solution
- `SearchInsertPositionTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
