# 308. Range Sum Query 2D - Mutable

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/matrix/308_range_sum_query_2d_mutable`
- Folder Name: `308_range_sum_query_2d_mutable`
- Official Link: https://leetcode.com/problems/range-sum-query-2d-mutable/

## Problem Overview
Implement the core logic for Range Sum Query 2D - Mutable exactly as the prompt defines.
Work through the array based on the problem rule and compute the requested value.

## Java Starter Signature
```java
public List<String> solve(Object inputs, Object inputs)
```

## Suggested Test Cases
1. `s = ""` -> `""`
2. `s = "abc"` -> `"abc"`
3. `s = "aab"` -> `"aab"`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RangeSumQueryTwoDMutable.java` contains the correct class name and Java method signature.
- `RangeSumQueryTwoDMutableTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RangeSumQueryTwoDMutable.java` - blank Java starter solution
- `RangeSumQueryTwoDMutableTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
