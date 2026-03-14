# 70. Climbing Stairs

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Dynamic Programming
- Folder Path: `leetcode/easy/dynamic_programming/70_climbing_stairs`
- Folder Name: `70_climbing_stairs`
- Official Link: https://leetcode.com/problems/climbing-stairs/

## Problem Overview
Count how many distinct ways there are to climb to the top when you may take one or two steps at a time.

## Java Starter Signature
```java
public int climbStairs(int n)
```


## Suggested Test Cases
1. `n = 2 -> 2`
2. `n = 3 -> 3`
3. `n = 5 -> 8`

## What To Watch For
- Base cases matter because every later state depends on them.
- Write down the transition clearly before coding so each state means exactly one thing.
- Check whether the answer belongs at the final cell, the final index, or the best value seen anywhere.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ClimbingStairs.java` contains the correct class name and Java method signature.
- `ClimbingStairsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ClimbingStairs.java` - blank Java starter solution
- `ClimbingStairsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
