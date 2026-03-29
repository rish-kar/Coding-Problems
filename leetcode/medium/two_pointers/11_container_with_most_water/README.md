# 11. Container With Most Water

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/two_pointers/11_container_with_most_water`
- Folder Name: `11_container_with_most_water`
- Official Link: https://leetcode.com/problems/container-with-most-water/

## Problem Overview
You are given an integer array height of length n . There are n vertical lines drawn such that the two endpoints of the i th line are (i, 0) and (i, height[i]) .
Find two lines that together with the x-axis form a container, such that the container contains the most water.

## Java Starter Signature
```java
public int maxArea(int[] height)
```

## Suggested Test Cases
1. `height = [1,8,6,2,5,4,8,3,7]` -> `49`
2. `height = [1,1]` -> `1`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ContainerWithMostWater.java` contains the correct class name and Java method signature.
- `ContainerWithMostWaterTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ContainerWithMostWater.java` - blank Java starter solution
- `ContainerWithMostWaterTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
