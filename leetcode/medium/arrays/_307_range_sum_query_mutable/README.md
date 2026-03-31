# 307. Range Sum Query - Mutable

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/307_range_sum_query_mutable`
- Folder Name: `307_range_sum_query_mutable`
- Official Link: https://leetcode.com/problems/range-sum-query-mutable/

## Problem Overview
You are given an integer array nums , handle multiple queries of the following types
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public RangeSumQueryMutable(int[] nums)
```

## Suggested Test Cases
1. `nums = [single element]` -> `returns the correct base-case value`
2. `nums = [0]` -> `0`
3. `nums = [1,2,3]` -> `3`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RangeSumQueryMutable.java` contains the correct class name and Java method signature.
- `RangeSumQueryMutableTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RangeSumQueryMutable.java` - blank Java starter solution
- `RangeSumQueryMutableTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
