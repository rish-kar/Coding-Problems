# 313. Super Ugly Number

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/math/313_super_ugly_number`
- Folder Name: `313_super_ugly_number`
- Official Link: https://leetcode.com/problems/super-ugly-number/

## Problem Overview
A super ugly number is a positive integer whose prime factors are in the array primes .
You are given an integer n and an array of integers primes , return the n th super ugly number .

## Java Starter Signature
```java
public int nthSuperUglyNumber(int n, int[] primes)
```

## Suggested Test Cases
1. `n = 12, primes = [2,7,13,19]` -> `32`
2. `n = 1, primes = [2,3,5]` -> `1`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SuperUglyNumber.java` contains the correct class name and Java method signature.
- `SuperUglyNumberTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SuperUglyNumber.java` - blank Java starter solution
- `SuperUglyNumberTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
