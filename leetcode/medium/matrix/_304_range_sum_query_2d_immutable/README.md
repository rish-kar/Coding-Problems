# 304. Range Sum Query 2D - Immutable

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/matrix/304_range_sum_query_2d_immutable`
- Folder Name: `304_range_sum_query_2d_immutable`
- Official Link: https://leetcode.com/problems/range-sum-query-2d-immutable/

## Problem Overview
You are given a 2D matrix matrix , handle multiple queries of the following type
You must design an algorithm where sumRegion works on O(1) time complexity.

## Java Starter Signature
```java
public RangeSumQueryTwoDImmutable(int[][] matrix)
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

- `RangeSumQueryTwoDImmutable.java` contains the correct class name and Java method signature.
- `RangeSumQueryTwoDImmutableTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RangeSumQueryTwoDImmutable.java` - blank Java starter solution
- `RangeSumQueryTwoDImmutableTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
