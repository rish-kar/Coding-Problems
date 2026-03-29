# 190. Reverse Bits

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Bit Manipulation
- Folder Path: `leetcode/easy/arrays/190_reverse_bits`
- Folder Name: `190_reverse_bits`
- Official Link: https://leetcode.com/problems/reverse-bits/

## Problem Overview
Reverse bits of a given 32 bits signed integer.
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int reverseBits(int n)
```

## Suggested Test Cases
1. `n = 43261596` -> `964176192`
2. `n = 2147483644` -> `1073741822`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Cover edge inputs explicitly so `reverseBits` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ReverseBits.java` contains the correct class name and Java method signature.
- `ReverseBitsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ReverseBits.java` - blank Java starter solution
- `ReverseBitsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
