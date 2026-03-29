# 293. Flip Game

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Strings
- Folder Path: `leetcode/easy/arrays/293_flip_game`
- Folder Name: `293_flip_game`
- Official Link: https://leetcode.com/problems/flip-game/

## Problem Overview
Implement the core logic for Flip Game exactly as the prompt defines.
Process the string input according to the matching or transformation rule in the prompt.

## Java Starter Signature
```java
public List<String> generatePossibleNextMoves(String currentState)
```

## Suggested Test Cases
1. `s = ""` -> `""`
2. `s = "abc"` -> `"abc"`
3. `s = "aab"` -> `"aab"`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `FlipGame.java` contains the correct class name and Java method signature.
- `FlipGameTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `FlipGame.java` - blank Java starter solution
- `FlipGameTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
