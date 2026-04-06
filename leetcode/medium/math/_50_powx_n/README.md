# 50. Pow(x, n)

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Math
- Folder Path: `leetcode/medium/math/50_powx_n`
- Folder Name: `50_powx_n`
- Official Link: https://leetcode.com/problems/powx-n/

## Problem Overview
Implement pow(x, n) , which calculates x raised to the power n (i.e., x n ).
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public double myPow(double x, int n)
```

## Suggested Test Cases
1. `x = 2.00000, n = 10` -> `1024.00000`
2. `x = 2.10000, n = 3` -> `9.26100`
3. `x = 2.00000, n = -2` -> `0.25000`

## What To Watch For
- Cover edge inputs explicitly so `myPow` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PowXN.java` contains the correct class name and Java method signature.
- `PowXNTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PowXN.java` - blank Java starter solution
- `PowXNTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
