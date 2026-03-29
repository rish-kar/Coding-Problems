# 56. Merge Intervals

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/intervals/56_merge_intervals`
- Folder Name: `56_merge_intervals`
- Official Link: https://leetcode.com/problems/merge-intervals/

## Problem Overview
You are given an array of intervals where intervals[i] = [start i , end i ] , merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int[][] merge(int[][] intervals)
```

## Suggested Test Cases
1. `intervals = [[1,3],[2,6],[8,10],[15,18]]` -> `[[1,6],[8,10],[15,18]]`
2. `intervals = [[1,4],[4,5]]` -> `[[1,5]]`
3. `intervals = [[4,7],[1,4]]` -> `[[1,7]]`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MergeIntervals.java` contains the correct class name and Java method signature.
- `MergeIntervalsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MergeIntervals.java` - blank Java starter solution
- `MergeIntervalsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
