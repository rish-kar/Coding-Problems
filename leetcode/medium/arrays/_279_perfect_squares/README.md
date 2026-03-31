# 279. Perfect Squares

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Dynamic Programming
- Folder Path: `leetcode/medium/arrays/279_perfect_squares`
- Folder Name: `279_perfect_squares`
- Official Link: https://leetcode.com/problems/perfect-squares/

## Problem Overview
You are given an integer n , return the least number of perfect square numbers that sum to n .
A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself. For example, 1 , 4 , 9 , and 16 are perfect squares while 3 and 11 are not.

## Java Starter Signature
```java
public int numSquares(int n)
```

## Suggested Test Cases
1. `n = 12` -> `3`
2. `n = 13` -> `2`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Define state meaning before coding transitions.
- Initialize base states explicitly to avoid propagation errors.
- Verify transition bounds so index access never goes out of range.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PerfectSquares.java` contains the correct class name and Java method signature.
- `PerfectSquaresTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PerfectSquares.java` - blank Java starter solution
- `PerfectSquaresTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
