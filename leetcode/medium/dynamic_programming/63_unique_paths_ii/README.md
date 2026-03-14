# 63. Unique Paths II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Dynamic Programming
- Folder Path: `leetcode/medium/dynamic_programming/63_unique_paths_ii`
- Folder Name: `63_unique_paths_ii`
- Official Link: https://leetcode.com/problems/unique-paths-ii/

## Problem Overview
Count valid right-and-down paths in a grid that contains blocked cells.

## Java Starter Signature
```java
public int uniquePathsWithObstacles(int[][] obstacleGrid)
```


## Suggested Test Cases
1. `obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]] -> 2`
2. `obstacleGrid = [[0,1],[0,0]] -> 1`
3. `if the start is blocked, the answer is 0`

## What To Watch For
- Base cases matter because every later state depends on them.
- Write down the transition clearly before coding so each state means exactly one thing.
- Check whether the answer belongs at the final cell, the final index, or the best value seen anywhere.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `UniquePathsII.java` contains the correct class name and Java method signature.
- `UniquePathsIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `UniquePathsII.java` - blank Java starter solution
- `UniquePathsIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
