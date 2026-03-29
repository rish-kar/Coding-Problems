# 367. Valid Perfect Square

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Binary Search
- Folder Path: `leetcode/easy/arrays/367_valid_perfect_square`
- Folder Name: `367_valid_perfect_square`
- Official Link: https://leetcode.com/problems/valid-perfect-square/

## Problem Overview
You are given a positive integer num, return true if num is a perfect square or false otherwise .
A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

## Java Starter Signature
```java
public boolean isPerfectSquare(int num)
```

## Suggested Test Cases
1. `num = 16` -> `true`
2. `num = 14` -> `false`
3. `input = []` -> `true`

## What To Watch For
- Keep interval boundaries consistent (`[low, high]` or `[low, high)`) through the whole loop.
- Recompute the midpoint safely and update the correct boundary each step.
- Return the exact index/boundary requested, not just any matching position.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ValidPerfectSquare.java` contains the correct class name and Java method signature.
- `ValidPerfectSquareTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ValidPerfectSquare.java` - blank Java starter solution
- `ValidPerfectSquareTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
