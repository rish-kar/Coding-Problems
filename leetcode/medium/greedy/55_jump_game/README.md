# 55. Jump Game

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/greedy/55_jump_game`
- Folder Name: `55_jump_game`
- Official Link: https://leetcode.com/problems/jump-game/

## Problem Overview
You are given an integer array nums . You are initially positioned at the array's first index , and each element in the array represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise .

## Java Starter Signature
```java
public boolean canJump(int[] nums)
```

## Suggested Test Cases
1. `nums = [2,3,1,1,4]` -> `true`
2. `nums = [3,2,1,0,4]` -> `false`
3. `nums = []` -> `false`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `JumpGame.java` contains the correct class name and Java method signature.
- `JumpGameTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `JumpGame.java` - blank Java starter solution
- `JumpGameTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
