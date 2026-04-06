# 218. The Skyline Problem

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/arrays/218_the_skyline_problem`
- Folder Name: `218_the_skyline_problem`
- Official Link: https://leetcode.com/problems/the-skyline-problem/

## Problem Overview
A city's skyline is the outer contour of the silhouette formed by all the buildings in that city when viewed from a distance. You are given the locations and heights of all the buildings, return the skyline formed by these buildings collectively .
The geometric information of each building is given in the array buildings where buildings[i] = [left i , right i , height i ]

## Java Starter Signature
```java
public List<List<Integer>> getSkyline(int[][] buildings)
```

## Suggested Test Cases
1. `buildings = [[2,9,10],[3,7,15],[5,12,12],[15,20,10],[19,24,8]]` -> `[[2,10],[3,15],[7,12],[12,0],[15,10],[20,8],[24,0]]`
2. `buildings = [[0,2,3],[2,5,3]]` -> `[[0,3],[5,0]]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `TheSkylineProblem.java` contains the correct class name and Java method signature.
- `TheSkylineProblemTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `TheSkylineProblem.java` - blank Java starter solution
- `TheSkylineProblemTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
