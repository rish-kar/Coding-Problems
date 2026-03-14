# 35. Search Insert Position

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Binary Search
- Folder Path: `leetcode/easy/binary_search/35_search_insert_position`
- Folder Name: `35_search_insert_position`
- Official Link: https://leetcode.com/problems/search-insert-position/

## Problem Overview
Return the index where the target exists or should be inserted to keep the array sorted.

## Java Starter Signature
```java
public int searchInsert(int[] nums, int target)
```


## Suggested Test Cases
1. `nums = [1,3,5,6], target = 5 -> 2`
2. `nums = [1,3,5,6], target = 2 -> 1`
3. `nums = [1,3,5,6], target = 7 -> 4`

## What To Watch For
- Decide whether the interval is closed or half-open and keep that rule consistent.
- Midpoint and boundary updates should always shrink the search space.
- When the loop ends, confirm whether the answer is a found index or an insertion boundary.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SearchInsertPosition.java` contains the correct class name and Java method signature.
- `SearchInsertPositionTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SearchInsertPosition.java` - blank Java starter solution
- `SearchInsertPositionTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
