# 52. N-Queens II

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Backtracking
- Folder Path: `leetcode/hard/backtracking/52_n_queens_ii`
- Folder Name: `52_n_queens_ii`
- Official Link: https://leetcode.com/problems/n-queens-ii/

## Problem Overview
Return how many distinct n-queens arrangements exist.

## Java Starter Signature
```java
public int totalNQueens(int n)
```


## Suggested Test Cases
1. `n = 4 -> 2`
2. `n = 1 -> 1`
3. `n = 5 -> 10`

## What To Watch For
- Define the stopping condition first so you know exactly when to record an answer.
- Undo each choice after the recursive call so the next branch starts cleanly.
- If duplicates are possible, decide where to prune them before recursion explodes.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `NQueensII.java` contains the correct class name and Java method signature.
- `NQueensIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `NQueensII.java` - blank Java starter solution
- `NQueensIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
