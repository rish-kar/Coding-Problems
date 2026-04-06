# 36. Valid Sudoku

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/matrix/36_valid_sudoku`
- Folder Name: `36_valid_sudoku`
- Official Link: https://leetcode.com/problems/valid-sudoku/

## Problem Overview
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public boolean isValidSudoku(char[][] board)
```

## Suggested Test Cases
1. `board = [["5","3",".",".","7",".",".",".","."] ,["6",".",".","1","9","5",".",".","."] ,[".","9","8",".",".",".",".","6","."] ,["8",".",".",".","6",".",".",".","3"] ,["4",".",".","8",".","3",".",".","1"] ,["7",".",".",".","2",".",".",".","6"] ,[".","6",".",".",".",".","2","8","."] ,[".",".",".","4","1","9",".",".","5"] ,[".",".",".",".","8",".",".","7","9"]]` -> `true`
2. `board = [["8","3",".",".","7",".",".",".","."] ,["6",".",".","1","9","5",".",".","."] ,[".","9","8",".",".",".",".","6","."] ,["8",".",".",".","6",".",".",".","3"] ,["4",".",".","8",".","3",".",".","1"] ,["7",".",".",".","2",".",".",".","6"] ,[".","6",".",".",".",".","2","8","."] ,[".",".",".","4","1","9",".",".","5"] ,[".",".",".",".","8",".",".","7","9"]]` -> `false`
3. `input = []` -> `true`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ValidSudoku.java` contains the correct class name and Java method signature.
- `ValidSudokuTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ValidSudoku.java` - blank Java starter solution
- `ValidSudokuTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
