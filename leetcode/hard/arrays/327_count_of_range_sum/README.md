# 327. Count of Range Sum

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/arrays/327_count_of_range_sum`
- Folder Name: `327_count_of_range_sum`
- Official Link: https://leetcode.com/problems/count-of-range-sum/

## Problem Overview
You are given an integer array nums and two integers lower and upper , return the number of range sums that lie in [lower, upper] inclusive .
Range sum S(i, j) is defined as the sum of the elements in nums between indices i and j inclusive, where i .

## Java Starter Signature
```java
public int countRangeSum(int[] nums, int lower, int upper)
```

## Suggested Test Cases
1. `nums = [-2,5,-1], lower = -2, upper = 2` -> `3`
2. `nums = [0], lower = 0, upper = 0` -> `1`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `CountOfRangeSum.java` contains the correct class name and Java method signature.
- `CountOfRangeSumTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `CountOfRangeSum.java` - blank Java starter solution
- `CountOfRangeSumTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
