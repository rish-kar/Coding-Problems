# 69. Sqrt(x)

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Binary Search
- Folder Path: `leetcode/easy/binary_search/69_sqrtx`
- Folder Name: `69_sqrtx`
- Official Link: https://leetcode.com/problems/sqrtx/

## Problem Overview
You are given a non-negative integer x , return the square root of x rounded down to the nearest integer . The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.

## Java Starter Signature
```java
public int mySqrt(int x)
```

## Suggested Test Cases
1. `x = 4` -> `2`
2. `x = 8` -> `2`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Keep interval boundaries consistent (`[low, high]` or `[low, high)`) through the whole loop.
- Recompute the midpoint safely and update the correct boundary each step.
- Return the exact index/boundary requested, not just any matching position.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SqrtX.java` contains the correct class name and Java method signature.
- `SqrtXTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SqrtX.java` - blank Java starter solution
- `SqrtXTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
