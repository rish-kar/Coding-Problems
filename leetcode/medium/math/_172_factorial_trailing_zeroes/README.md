# 172. Factorial Trailing Zeroes

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Math
- Folder Path: `leetcode/medium/math/172_factorial_trailing_zeroes`
- Folder Name: `172_factorial_trailing_zeroes`
- Official Link: https://leetcode.com/problems/factorial-trailing-zeroes/

## Problem Overview
You are given an integer n , return the number of trailing zeroes in n! .
Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1 .

## Java Starter Signature
```java
public int trailingZeroes(int n)
```

## Suggested Test Cases
1. `n = 3` -> `0`
2. `n = 5` -> `1`
3. `n = 0` -> `0`

## What To Watch For
- Cover edge inputs explicitly so `trailingZeroes` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `FactorialTrailingZeroes.java` contains the correct class name and Java method signature.
- `FactorialTrailingZeroesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `FactorialTrailingZeroes.java` - blank Java starter solution
- `FactorialTrailingZeroesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
