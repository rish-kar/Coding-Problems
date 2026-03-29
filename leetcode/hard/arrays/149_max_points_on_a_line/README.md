# 149. Max Points on a Line

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/arrays/149_max_points_on_a_line`
- Folder Name: `149_max_points_on_a_line`
- Official Link: https://leetcode.com/problems/max-points-on-a-line/

## Problem Overview
You are given an array of points where points[i] = [x i , y i ] represents a point on the X-Y plane, return the maximum number of points that lie on the same straight line .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int maxPoints(int[][] points)
```

## Suggested Test Cases
1. `points = [[1,1],[2,2],[3,3]]` -> `3`
2. `points = [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]` -> `4`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MaxPointsOnALine.java` contains the correct class name and Java method signature.
- `MaxPointsOnALineTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MaxPointsOnALine.java` - blank Java starter solution
- `MaxPointsOnALineTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
