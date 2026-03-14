# 51. N-Queens

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Backtracking
- Folder Path: `leetcode/hard/backtracking/51_n_queens`
- Folder Name: `51_n_queens`
- Official Link: https://leetcode.com/problems/n-queens/

## Problem Overview
Return every valid n-queens board arrangement.

## Java Starter Signature
```java
public List<List<String>> solveNQueens(int n)
```


## Suggested Test Cases
1. `n = 4 -> 2 valid boards`
2. `n = 1 -> [["Q"]]`
3. `each board must place one queen per row and column`

## What To Watch For
- Define the stopping condition first so you know exactly when to record an answer.
- Undo each choice after the recursive call so the next branch starts cleanly.
- If duplicates are possible, decide where to prune them before recursion explodes.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `NQueens.java` contains the correct class name and Java method signature.
- `NQueensTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `NQueens.java` - blank Java starter solution
- `NQueensTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
