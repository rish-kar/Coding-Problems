# 312. Burst Balloons

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/dynamic_programming/312_burst_balloons`
- Folder Name: `312_burst_balloons`
- Official Link: https://leetcode.com/problems/burst-balloons/

## Problem Overview
You are given n balloons, indexed from 0 to n - 1 . Each balloon is painted with a number on it represented by an array nums . You are asked to burst all the balloons.
If you burst the i th balloon, you will get nums[i - 1] * nums[i] * nums[i + 1] coins. If i - 1 or i + 1 goes out of bounds of the array, then treat it as if there is a balloon with a 1 painted on it.

## Java Starter Signature
```java
public int maxCoins(int[] nums)
```

## Suggested Test Cases
1. `nums = [3,1,5,8]` -> `167`
2. `nums = [1,5]` -> `10`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BurstBalloons.java` contains the correct class name and Java method signature.
- `BurstBalloonsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BurstBalloons.java` - blank Java starter solution
- `BurstBalloonsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
