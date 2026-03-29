# 292. Nim Game

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Math
- Folder Path: `leetcode/easy/arrays/292_nim_game`
- Folder Name: `292_nim_game`
- Official Link: https://leetcode.com/problems/nim-game/

## Problem Overview
You are playing the following Nim Game with your friend
You are given n , the number of stones in the heap, return true if you can win the game assuming both you and your friend play optimally, otherwise return false .

## Java Starter Signature
```java
public boolean canWinNim(int n)
```

## Suggested Test Cases
1. `n = 4` -> `false`
2. `n = 1` -> `true`
3. `n = 2` -> `true`

## What To Watch For
- Cover edge inputs explicitly so `canWinNim` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `NimGame.java` contains the correct class name and Java method signature.
- `NimGameTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `NimGame.java` - blank Java starter solution
- `NimGameTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
