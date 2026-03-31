# 63. Unique Paths II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/dynamic_programming/63_unique_paths_ii`
- Folder Name: `63_unique_paths_ii`
- Official Link: https://leetcode.com/problems/unique-paths-ii/

## Problem Overview
You are given an m x n integer array grid . There is a robot initially located at the top-left corner (i.e., grid[0][0] ). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1] ). The robot can only move either down or right at any point in time.
An obstacle and space are marked as 1 or 0 respectively in grid . A path that the robot takes cannot include any square that is an obstacle.

## Java Starter Signature
```java
public int uniquePathsWithObstacles(int[][] obstacleGrid)
```

## Suggested Test Cases
1. `obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]` -> `2`
2. `obstacleGrid = [[0,1],[0,0]]` -> `1`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `UniquePathsII.java` contains the correct class name and Java method signature.
- `UniquePathsIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `UniquePathsII.java` - blank Java starter solution
- `UniquePathsIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
