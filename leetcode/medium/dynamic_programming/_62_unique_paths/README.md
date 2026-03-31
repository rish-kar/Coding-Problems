# 62. Unique Paths

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Dynamic Programming
- Folder Path: `leetcode/medium/dynamic_programming/62_unique_paths`
- Folder Name: `62_unique_paths`
- Official Link: https://leetcode.com/problems/unique-paths/

## Problem Overview
There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0] ). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1] ). The robot can only move either down or right at any point in time.
You are given the two integers m and n , return the number of possible unique paths that the robot can take to reach the bottom-right corner .

## Java Starter Signature
```java
public int uniquePaths(int m, int n)
```

## Suggested Test Cases
1. `m = 3, n = 7` -> `28`
2. `m = 3, n = 2` -> `3`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Define state meaning before coding transitions.
- Initialize base states explicitly to avoid propagation errors.
- Verify transition bounds so index access never goes out of range.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `UniquePaths.java` contains the correct class name and Java method signature.
- `UniquePathsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `UniquePaths.java` - blank Java starter solution
- `UniquePathsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
