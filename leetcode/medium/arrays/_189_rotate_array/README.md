# 189. Rotate Array

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/189_rotate_array`
- Folder Name: `189_rotate_array`
- Official Link: https://leetcode.com/problems/rotate-array/

## Problem Overview
You are given an integer array nums , rotate the array to the right by k steps, where k is non-negative.
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public void rotate(int[] nums, int k)
```

## Suggested Test Cases
1. `nums = [1,2,3,4,5,6,7], k = 3` -> `[5,6,7,1,2,3,4]`
2. `nums = [-1,-100,3,99], k = 2` -> `[3,99,-1,-100]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RotateArray.java` contains the correct class name and Java method signature.
- `RotateArrayTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RotateArray.java` - blank Java starter solution
- `RotateArrayTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
