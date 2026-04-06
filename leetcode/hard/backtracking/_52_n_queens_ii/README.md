# 52. N-Queens II

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Backtracking
- Folder Path: `leetcode/hard/backtracking/52_n_queens_ii`
- Folder Name: `52_n_queens_ii`
- Official Link: https://leetcode.com/problems/n-queens-ii/

## Problem Overview
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
You are given an integer n , return the number of distinct solutions to the n-queens puzzle .

## Java Starter Signature
```java
public int totalNQueens(int n)
```

## Suggested Test Cases
1. `n = 4` -> `2`
2. `n = 1` -> `1`
3. `second official example` -> `same expected output as the example`

## What To Watch For
- Cover edge inputs explicitly so `totalNQueens` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `NQueensII.java` contains the correct class name and Java method signature.
- `NQueensIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `NQueensII.java` - blank Java starter solution
- `NQueensIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
