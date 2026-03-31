# 79. Word Search

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/backtracking/79_word_search`
- Folder Name: `79_word_search`
- Official Link: https://leetcode.com/problems/word-search/

## Problem Overview
You are given an m x n grid of characters board and a string word , return true if word exists in the grid .
The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

## Java Starter Signature
```java
public boolean exist(char[][] board, String word)
```

## Suggested Test Cases
1. `board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"` -> `true`
2. `board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"` -> `true`
3. `board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"` -> `false`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `WordSearch.java` contains the correct class name and Java method signature.
- `WordSearchTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `WordSearch.java` - blank Java starter solution
- `WordSearchTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
