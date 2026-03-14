# 57. Insert Interval

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Intervals
- Folder Path: `leetcode/medium/intervals/57_insert_interval`
- Folder Name: `57_insert_interval`
- Official Link: https://leetcode.com/problems/insert-interval/

## Problem Overview
Insert the new interval into the sorted non-overlapping list and merge when necessary.

## Java Starter Signature
```java
public int[][] insert(int[][] intervals, int[] newInterval)
```


## Suggested Test Cases
1. `intervals = [[1,3],[6,9]], newInterval = [2,5] -> [[1,5],[6,9]]`
2. `intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8] -> [[1,2],[3,10],[12,16]]`
3. `intervals = [], newInterval = [5,7] -> [[5,7]]`

## What To Watch For
- Confirm whether intervals are already sorted or need sorting first.
- Overlaps at shared endpoints should be handled consistently.
- Build the answer incrementally so merged ranges are emitted only when finished.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `InsertInterval.java` contains the correct class name and Java method signature.
- `InsertIntervalTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `InsertInterval.java` - blank Java starter solution
- `InsertIntervalTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
