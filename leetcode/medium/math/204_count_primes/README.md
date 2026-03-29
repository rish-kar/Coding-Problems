# 204. Count Primes

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/math/204_count_primes`
- Folder Name: `204_count_primes`
- Official Link: https://leetcode.com/problems/count-primes/

## Problem Overview
You are given an integer n , return the number of prime numbers that are strictly less than n .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int countPrimes(int n)
```

## Suggested Test Cases
1. `n = 10` -> `4`
2. `n = 0` -> `0`
3. `n = 1` -> `0`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `CountPrimes.java` contains the correct class name and Java method signature.
- `CountPrimesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `CountPrimes.java` - blank Java starter solution
- `CountPrimesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
