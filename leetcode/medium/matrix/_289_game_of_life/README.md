# 289. Game of Life

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/matrix/289_game_of_life`
- Folder Name: `289_game_of_life`
- Official Link: https://leetcode.com/problems/game-of-life/

## Problem Overview
According to Wikipedia's article : "The Game of Life , also known simply as Life , is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1 ) or dead (represented by a 0 ). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article)

## Java Starter Signature
```java
public void gameOfLife(int[][] board)
```

## Suggested Test Cases
1. `board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]` -> `[[0,0,0],[1,0,1],[0,1,1],[0,1,0]]`
2. `board = [[1,1],[1,0]]` -> `[[1,1],[1,1]]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `GameOfLife.java` contains the correct class name and Java method signature.
- `GameOfLifeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `GameOfLife.java` - blank Java starter solution
- `GameOfLifeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
