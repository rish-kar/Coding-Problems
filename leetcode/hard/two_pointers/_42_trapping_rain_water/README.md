# 42. Trapping Rain Water

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/two_pointers/42_trapping_rain_water`
- Folder Name: `42_trapping_rain_water`
- Official Link: https://leetcode.com/problems/trapping-rain-water/

## Problem Overview
You are given n non-negative integers representing an elevation map where the width of each bar is 1 , compute how much water it can trap after raining.
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int trap(int[] height)
```

## Suggested Test Cases
1. `height = [0,1,0,2,1,0,1,3,2,1,2,1]` -> `6`
2. `height = [4,2,0,3,2,5]` -> `9`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `TrappingRainWater.java` contains the correct class name and Java method signature.
- `TrappingRainWaterTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `TrappingRainWater.java` - blank Java starter solution
- `TrappingRainWaterTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
