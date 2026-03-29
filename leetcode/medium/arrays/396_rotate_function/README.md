# 396. Rotate Function

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/396_rotate_function`
- Folder Name: `396_rotate_function`
- Official Link: https://leetcode.com/problems/rotate-function/

## Problem Overview
You are given an integer array nums of length n .
Assume arr k to be an array obtained by rotating nums by k positions clock-wise. We define the rotation function F on nums as follow

## Java Starter Signature
```java
public int maxRotateFunction(int[] nums)
```

## Suggested Test Cases
1. `nums = [4,3,2,6]` -> `26`
2. `nums = [100]` -> `0`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RotateFunction.java` contains the correct class name and Java method signature.
- `RotateFunctionTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RotateFunction.java` - blank Java starter solution
- `RotateFunctionTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
