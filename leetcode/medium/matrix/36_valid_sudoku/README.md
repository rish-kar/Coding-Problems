# 36. Valid Sudoku

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Matrix
- Folder Path: `leetcode/medium/matrix/36_valid_sudoku`
- Folder Name: `36_valid_sudoku`
- Official Link: https://leetcode.com/problems/valid-sudoku/

## Problem Overview
Check whether the partially filled Sudoku board follows row, column, and box rules.

## Java Starter Signature
```java
public boolean isValidSudoku(char[][] board)
```


## Suggested Test Cases
1. `board = sample valid grid -> true`
2. `board = sample invalid row or box -> false`
3. `board with repeated digit in a column -> false`

## What To Watch For
- Always keep row and column bounds separate so rectangular inputs still work.
- If you mutate the matrix in place, decide which cells can safely act as markers.
- Traversal problems usually need a clear visited rule or shrinking boundary rule.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ValidSudoku.java` contains the correct class name and Java method signature.
- `ValidSudokuTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ValidSudoku.java` - blank Java starter solution
- `ValidSudokuTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
