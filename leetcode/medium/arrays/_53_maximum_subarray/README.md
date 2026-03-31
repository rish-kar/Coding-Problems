# 53. Maximum Subarray

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/53_maximum_subarray`
- Folder Name: `53_maximum_subarray`
- Official Link: https://leetcode.com/problems/maximum-subarray/

## Problem Overview
You are given an integer array nums , find the subarray with the largest sum, and return its sum .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int maxSubArray(int[] nums)
```

## Suggested Test Cases
1. `nums = [-2,1,-3,4,-1,2,1,-5,4]` -> `6`
2. `nums = [1]` -> `1`
3. `nums = [5,4,-1,7,8]` -> `23`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MaximumSubarray.java` contains the correct class name and Java method signature.
- `MaximumSubarrayTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MaximumSubarray.java` - blank Java starter solution
- `MaximumSubarrayTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
