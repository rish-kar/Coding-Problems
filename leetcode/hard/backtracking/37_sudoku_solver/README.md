# 37. Sudoku Solver

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Backtracking
- Folder Path: `leetcode/hard/backtracking/37_sudoku_solver`
- Folder Name: `37_sudoku_solver`
- Official Link: https://leetcode.com/problems/sudoku-solver/

## Problem Overview
Fill the Sudoku board in place so that it becomes a valid completed puzzle.

## Java Starter Signature
```java
public void solveSudoku(char[][] board)
```


## Suggested Test Cases
1. `solve the standard partially filled 9x9 board in place`
2. `board with many blanks should still finish`
3. `the final board must satisfy all Sudoku rules`

## What To Watch For
- Define the stopping condition first so you know exactly when to record an answer.
- Undo each choice after the recursive call so the next branch starts cleanly.
- If duplicates are possible, decide where to prune them before recursion explodes.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SudokuSolver.java` contains the correct class name and Java method signature.
- `SudokuSolverTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SudokuSolver.java` - blank Java starter solution
- `SudokuSolverTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
