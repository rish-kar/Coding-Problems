# 338. Counting Bits

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Dynamic Programming
- Folder Path: `leetcode/easy/arrays/338_counting_bits`
- Folder Name: `338_counting_bits`
- Official Link: https://leetcode.com/problems/counting-bits/

## Problem Overview
You are given an integer n , return an array ans of length n + 1 such that for each i ( 0 ) , ans[i] is the number of 1 's in the binary representation of i .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int[] countBits(int n)
```

## Suggested Test Cases
1. `n = 2` -> `[0,1,1]`
2. `n = 5` -> `[0,1,1,2,1,2]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Define state meaning before coding transitions.
- Initialize base states explicitly to avoid propagation errors.
- Verify transition bounds so index access never goes out of range.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `CountingBits.java` contains the correct class name and Java method signature.
- `CountingBitsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `CountingBits.java` - blank Java starter solution
- `CountingBitsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
