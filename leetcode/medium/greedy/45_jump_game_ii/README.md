# 45. Jump Game II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/greedy/45_jump_game_ii`
- Folder Name: `45_jump_game_ii`
- Official Link: https://leetcode.com/problems/jump-game-ii/

## Problem Overview
You are given a 0-indexed array of integers nums of length n . You are initially positioned at index 0.
Each element nums[i] represents the maximum length of a forward jump from index i . In other words, if you are at index i , you can jump to any index (i + j) where

## Java Starter Signature
```java
public int jump(int[] nums)
```

## Suggested Test Cases
1. `nums = [2,3,1,1,4]` -> `2`
2. `nums = [2,3,0,1,4]` -> `2`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `JumpGameII.java` contains the correct class name and Java method signature.
- `JumpGameIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `JumpGameII.java` - blank Java starter solution
- `JumpGameIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
