# 233. Number of Digit One

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Dynamic Programming
- Folder Path: `leetcode/hard/arrays/233_number_of_digit_one`
- Folder Name: `233_number_of_digit_one`
- Official Link: https://leetcode.com/problems/number-of-digit-one/

## Problem Overview
You are given an integer n , count the total number of digit 1 appearing in all non-negative integers less than or equal to n .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int countDigitOne(int n)
```

## Suggested Test Cases
1. `n = 13` -> `6`
2. `n = 0` -> `0`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Define state meaning before coding transitions.
- Initialize base states explicitly to avoid propagation errors.
- Verify transition bounds so index access never goes out of range.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `NumberOfDigitOne.java` contains the correct class name and Java method signature.
- `NumberOfDigitOneTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `NumberOfDigitOne.java` - blank Java starter solution
- `NumberOfDigitOneTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
