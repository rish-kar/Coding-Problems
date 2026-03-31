# 390. Elimination Game

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Math
- Folder Path: `leetcode/medium/arrays/390_elimination_game`
- Folder Name: `390_elimination_game`
- Official Link: https://leetcode.com/problems/elimination-game/

## Problem Overview
You have a list arr of all integers in the range [1, n] sorted in a strictly increasing order. Apply the following algorithm on arr
You are given the integer n , return the last number that remains in arr .

## Java Starter Signature
```java
public int lastRemaining(int n)
```

## Suggested Test Cases
1. `n = 9` -> `6`
2. `n = 1` -> `1`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Cover edge inputs explicitly so `lastRemaining` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `EliminationGame.java` contains the correct class name and Java method signature.
- `EliminationGameTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `EliminationGame.java` - blank Java starter solution
- `EliminationGameTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
