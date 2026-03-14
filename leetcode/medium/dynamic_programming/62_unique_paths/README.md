# 62. Unique Paths

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Dynamic Programming
- Folder Path: `leetcode/medium/dynamic_programming/62_unique_paths`
- Folder Name: `62_unique_paths`
- Official Link: https://leetcode.com/problems/unique-paths/

## Problem Overview
Count how many ways there are to move from the top-left corner to the bottom-right corner of the grid using only right and down moves.

## Java Starter Signature
```java
public int uniquePaths(int m, int n)
```


## Suggested Test Cases
1. `m = 3, n = 7 -> 28`
2. `m = 3, n = 2 -> 3`
3. `m = 7, n = 3 -> 28`

## What To Watch For
- Base cases matter because every later state depends on them.
- Write down the transition clearly before coding so each state means exactly one thing.
- Check whether the answer belongs at the final cell, the final index, or the best value seen anywhere.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `UniquePaths.java` contains the correct class name and Java method signature.
- `UniquePathsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `UniquePaths.java` - blank Java starter solution
- `UniquePathsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
