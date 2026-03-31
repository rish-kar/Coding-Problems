# 16. 3Sum Closest

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/two_pointers/16_3sum_closest`
- Folder Name: `16_3sum_closest`
- Official Link: https://leetcode.com/problems/3sum-closest/

## Problem Overview
You are given an integer array nums of length n and an integer target , find three integers at distinct indices in nums such that the sum is closest to target .
Return the sum of the three integers .

## Java Starter Signature
```java
public int threeSumClosest(int[] nums, int target)
```

## Suggested Test Cases
1. `nums = [-1,2,1,-4], target = 1` -> `2`
2. `nums = [0,0,0], target = 1` -> `0`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ThreeSumClosest.java` contains the correct class name and Java method signature.
- `ThreeSumClosestTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ThreeSumClosest.java` - blank Java starter solution
- `ThreeSumClosestTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
