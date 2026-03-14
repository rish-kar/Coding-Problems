# 45. Jump Game II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Greedy
- Folder Path: `leetcode/medium/greedy/45_jump_game_ii`
- Folder Name: `45_jump_game_ii`
- Official Link: https://leetcode.com/problems/jump-game-ii/

## Problem Overview
Return the minimum number of jumps needed to reach the last index.

## Java Starter Signature
```java
public int jump(int[] nums)
```


## Suggested Test Cases
1. `nums = [2,3,1,1,4] -> 2`
2. `nums = [2,3,0,1,4] -> 2`
3. `nums = [0] -> 0`

## What To Watch For
- Track the best local choice only when you can explain why it preserves a global optimum.
- Check unreachable cases separately from cases that merely need more steps.
- A running farthest reach or current layer boundary often reveals the solution structure.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `JumpGameII.java` contains the correct class name and Java method signature.
- `JumpGameIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `JumpGameII.java` - blank Java starter solution
- `JumpGameIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
