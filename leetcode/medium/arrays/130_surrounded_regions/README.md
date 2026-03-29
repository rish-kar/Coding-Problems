# 130. Surrounded Regions

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/130_surrounded_regions`
- Folder Name: `130_surrounded_regions`
- Official Link: https://leetcode.com/problems/surrounded-regions/

## Problem Overview
You are given an m x n matrix board containing letters 'X' and 'O' , capture regions that are surrounded
To capture a surrounded region , replace all 'O' s with 'X' s in-place within the original board. You do not need to return anything.

## Java Starter Signature
```java
public void solve(char[][] board)
```

## Suggested Test Cases
1. `board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]` -> `[["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]`
2. `board = [["X"]]` -> `[["X"]]`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SurroundedRegions.java` contains the correct class name and Java method signature.
- `SurroundedRegionsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SurroundedRegions.java` - blank Java starter solution
- `SurroundedRegionsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
