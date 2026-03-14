# 42. Trapping Rain Water

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Two Pointers
- Folder Path: `leetcode/hard/two_pointers/42_trapping_rain_water`
- Folder Name: `42_trapping_rain_water`
- Official Link: https://leetcode.com/problems/trapping-rain-water/

## Problem Overview
Compute how much rain water can be trapped between the bars after raining.

## Java Starter Signature
```java
public int trap(int[] height)
```


## Suggested Test Cases
1. `height = [0,1,0,2,1,0,1,3,2,1,2,1] -> 6`
2. `height = [4,2,0,3,2,5] -> 9`
3. `height = [1,2,3,4] -> 0`

## What To Watch For
- Move the pointer that can actually improve the answer instead of advancing both blindly.
- Sorted input often enables duplicate skipping and targeted pointer motion.
- Test very small inputs because pointer crossings are a common source of bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `TrappingRainWater.java` contains the correct class name and Java method signature.
- `TrappingRainWaterTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `TrappingRainWater.java` - blank Java starter solution
- `TrappingRainWaterTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
