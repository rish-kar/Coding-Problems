# 79. Word Search

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Backtracking
- Folder Path: `leetcode/medium/backtracking/79_word_search`
- Folder Name: `79_word_search`
- Official Link: https://leetcode.com/problems/word-search/

## Problem Overview
Check whether the word can be formed by sequentially adjacent cells without reusing a cell.

## Java Starter Signature
```java
public boolean exist(char[][] board, String word)
```


## Suggested Test Cases
1. `board = sample grid, word = "ABCCED" -> true`
2. `board = sample grid, word = "SEE" -> true`
3. `board = sample grid, word = "ABCB" -> false`

## What To Watch For
- Define the stopping condition first so you know exactly when to record an answer.
- Undo each choice after the recursive call so the next branch starts cleanly.
- If duplicates are possible, decide where to prune them before recursion explodes.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `WordSearch.java` contains the correct class name and Java method signature.
- `WordSearchTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `WordSearch.java` - blank Java starter solution
- `WordSearchTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
