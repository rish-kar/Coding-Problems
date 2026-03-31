# 51. N-Queens

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/backtracking/51_n_queens`
- Folder Name: `51_n_queens`
- Official Link: https://leetcode.com/problems/n-queens/

## Problem Overview
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
You are given an integer n , return all distinct solutions to the n-queens puzzle . You may return the answer in any order .

## Java Starter Signature
```java
public List<List<String>> solveNQueens(int n)
```

## Suggested Test Cases
1. `n = 4` -> `[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]`
2. `n = 1` -> `[["Q"]]`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `NQueens.java` contains the correct class name and Java method signature.
- `NQueensTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `NQueens.java` - blank Java starter solution
- `NQueensTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
