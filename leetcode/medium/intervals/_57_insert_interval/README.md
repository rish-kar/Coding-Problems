# 57. Insert Interval

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/intervals/57_insert_interval`
- Folder Name: `57_insert_interval`
- Official Link: https://leetcode.com/problems/insert-interval/

## Problem Overview
You are given an array of non-overlapping intervals intervals where intervals[i] = [start i , end i ] represent the start and the end of the i th interval and intervals is sorted in ascending order by start i . You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
Insert newInterval into intervals such that intervals is still sorted in ascending order by start i and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

## Java Starter Signature
```java
public int[][] insert(int[][] intervals, int[] newInterval)
```

## Suggested Test Cases
1. `intervals = [[1,3],[6,9]], newInterval = [2,5]` -> `[[1,5],[6,9]]`
2. `intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]` -> `[[1,2],[3,10],[12,16]]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `InsertInterval.java` contains the correct class name and Java method signature.
- `InsertIntervalTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `InsertInterval.java` - blank Java starter solution
- `InsertIntervalTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
