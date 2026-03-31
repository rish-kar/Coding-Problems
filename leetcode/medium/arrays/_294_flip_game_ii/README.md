# 294. Flip Game II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Dynamic Programming
- Folder Path: `leetcode/medium/arrays/294_flip_game_ii`
- Folder Name: `294_flip_game_ii`
- Official Link: https://leetcode.com/problems/flip-game-ii/

## Problem Overview
Implement the core logic for Flip Game II exactly as the prompt defines.
Define states and transitions that build partial answers toward the final result.

## Java Starter Signature
```java
public boolean canWin(String currentState)
```

## Suggested Test Cases
1. `second official example` -> `same expected output as the example`
2. `s = "", t = ""` -> `true`
3. `s = "a", t = ""` -> `false`

## What To Watch For
- Define state meaning before coding transitions.
- Initialize base states explicitly to avoid propagation errors.
- Verify transition bounds so index access never goes out of range.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `FlipGameII.java` contains the correct class name and Java method signature.
- `FlipGameIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `FlipGameII.java` - blank Java starter solution
- `FlipGameIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
