# 77. Combinations

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Backtracking
- Folder Path: `leetcode/medium/backtracking/77_combinations`
- Folder Name: `77_combinations`
- Official Link: https://leetcode.com/problems/combinations/

## Problem Overview
Return every way to choose k numbers from the range 1 through n.

## Java Starter Signature
```java
public List<List<Integer>> combine(int n, int k)
```


## Suggested Test Cases
1. `n = 4, k = 2 -> 6 combinations`
2. `n = 1, k = 1 -> [[1]]`
3. `n = 5, k = 3 -> all size-3 combinations`

## What To Watch For
- Define the stopping condition first so you know exactly when to record an answer.
- Undo each choice after the recursive call so the next branch starts cleanly.
- If duplicates are possible, decide where to prune them before recursion explodes.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `Combinations.java` contains the correct class name and Java method signature.
- `CombinationsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `Combinations.java` - blank Java starter solution
- `CombinationsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
