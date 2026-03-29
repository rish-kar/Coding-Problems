# 191. Number of 1 Bits

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Bit Manipulation
- Folder Path: `leetcode/easy/arrays/191_number_of_1_bits`
- Folder Name: `191_number_of_1_bits`
- Official Link: https://leetcode.com/problems/number-of-1-bits/

## Problem Overview
You are given a positive integer n , write a function that returns the number of set bits in its binary representation (also known as the Hamming weight ).
The input binary string 1011 has a total of three set bits.

## Java Starter Signature
```java
public int hammingWeight(int n)
```

## Suggested Test Cases
1. `n = 11` -> `3`
2. `n = 128` -> `1`
3. `n = 2147483645` -> `30`

## What To Watch For
- Cover edge inputs explicitly so `hammingWeight` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `NumberOfOneBits.java` contains the correct class name and Java method signature.
- `NumberOfOneBitsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `NumberOfOneBits.java` - blank Java starter solution
- `NumberOfOneBitsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
