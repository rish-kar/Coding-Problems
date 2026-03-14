# 64. Minimum Path Sum

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Dynamic Programming
- Folder Path: `leetcode/medium/dynamic_programming/64_minimum_path_sum`
- Folder Name: `64_minimum_path_sum`
- Official Link: https://leetcode.com/problems/minimum-path-sum/

## Problem Overview
Return the minimum sum along a path from the top-left to the bottom-right corner using only right and down moves.

## Java Starter Signature
```java
public int minPathSum(int[][] grid)
```


## Suggested Test Cases
1. `grid = [[1,3,1],[1,5,1],[4,2,1]] -> 7`
2. `grid = [[1,2,3],[4,5,6]] -> 12`
3. `a 1x1 grid returns its own value`

## What To Watch For
- Base cases matter because every later state depends on them.
- Write down the transition clearly before coding so each state means exactly one thing.
- Check whether the answer belongs at the final cell, the final index, or the best value seen anywhere.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MinimumPathSum.java` contains the correct class name and Java method signature.
- `MinimumPathSumTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MinimumPathSum.java` - blank Java starter solution
- `MinimumPathSumTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
