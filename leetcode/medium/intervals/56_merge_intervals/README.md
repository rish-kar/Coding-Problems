# 56. Merge Intervals

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Intervals
- Folder Path: `leetcode/medium/intervals/56_merge_intervals`
- Folder Name: `56_merge_intervals`
- Official Link: https://leetcode.com/problems/merge-intervals/

## Problem Overview
Merge all overlapping intervals and return the condensed list.

## Java Starter Signature
```java
public int[][] merge(int[][] intervals)
```


## Suggested Test Cases
1. `intervals = [[1,3],[2,6],[8,10],[15,18]] -> [[1,6],[8,10],[15,18]]`
2. `intervals = [[1,4],[4,5]] -> [[1,5]]`
3. `intervals = [[1,4],[0,4]] -> [[0,4]]`

## What To Watch For
- Confirm whether intervals are already sorted or need sorting first.
- Overlaps at shared endpoints should be handled consistently.
- Build the answer incrementally so merged ranges are emitted only when finished.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MergeIntervals.java` contains the correct class name and Java method signature.
- `MergeIntervalsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MergeIntervals.java` - blank Java starter solution
- `MergeIntervalsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
