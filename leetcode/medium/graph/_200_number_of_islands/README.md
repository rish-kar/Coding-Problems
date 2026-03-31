# 200. Number of Islands

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/graph/200_number_of_islands`
- Folder Name: `200_number_of_islands`
- Official Link: https://leetcode.com/problems/number-of-islands/

## Problem Overview
You are given an m x n 2D binary grid grid which represents a map of '1' s (land) and '0' s (water), return the number of islands .
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

## Java Starter Signature
```java
public int numIslands(char[][] grid)
```

## Suggested Test Cases
1. `grid = [ ["1","1","1","1","0"], ["1","1","0","1","0"], ["1","1","0","0","0"], ["0","0","0","0","0"] ]` -> `1`
2. `grid = [ ["1","1","0","0","0"], ["1","1","0","0","0"], ["0","0","1","0","0"], ["0","0","0","1","1"] ]` -> `3`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `NumberOfIslands.java` contains the correct class name and Java method signature.
- `NumberOfIslandsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `NumberOfIslands.java` - blank Java starter solution
- `NumberOfIslandsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
