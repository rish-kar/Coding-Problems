# 55. Jump Game

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Greedy
- Folder Path: `leetcode/medium/greedy/55_jump_game`
- Folder Name: `55_jump_game`
- Official Link: https://leetcode.com/problems/jump-game/

## Problem Overview
Decide whether you can reach the last index from the first index.

## Java Starter Signature
```java
public boolean canJump(int[] nums)
```


## Suggested Test Cases
1. `nums = [2,3,1,1,4] -> true`
2. `nums = [3,2,1,0,4] -> false`
3. `nums = [0] -> true`

## What To Watch For
- Track the best local choice only when you can explain why it preserves a global optimum.
- Check unreachable cases separately from cases that merely need more steps.
- A running farthest reach or current layer boundary often reveals the solution structure.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `JumpGame.java` contains the correct class name and Java method signature.
- `JumpGameTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `JumpGame.java` - blank Java starter solution
- `JumpGameTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
