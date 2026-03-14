# 50. Pow(x, n)

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Math
- Folder Path: `leetcode/medium/math/50_powx_n`
- Folder Name: `50_powx_n`
- Official Link: https://leetcode.com/problems/powx-n/

## Problem Overview
Compute x raised to the power n efficiently, including negative exponents.

## Java Starter Signature
```java
public double myPow(double x, int n)
```


## Suggested Test Cases
1. `x = 2.0, n = 10 -> 1024.0`
2. `x = 2.1, n = 3 -> 9.261`
3. `x = 2.0, n = -2 -> 0.25`

## What To Watch For
- Check overflow boundaries before returning the result.
- Negative values and zero often need separate reasoning from the main positive case.
- Look for repeated structure that can be reduced with arithmetic instead of brute force.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PowxN.java` contains the correct class name and Java method signature.
- `PowxNTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PowxN.java` - blank Java starter solution
- `PowxNTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
