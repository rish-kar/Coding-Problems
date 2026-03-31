# 357. Count Numbers with Unique Digits

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Dynamic Programming
- Folder Path: `leetcode/medium/sql/357_count_numbers_with_unique_digits`
- Folder Name: `357_count_numbers_with_unique_digits`
- Official Link: https://leetcode.com/problems/count-numbers-with-unique-digits/

## Problem Overview
You are given an integer n , return the count of all numbers with unique digits, x , where 0 n .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int countNumbersWithUniqueDigits(int n)
```

## Suggested Test Cases
1. `n = 2` -> `91`
2. `n = 0` -> `1`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Define state meaning before coding transitions.
- Initialize base states explicitly to avoid propagation errors.
- Verify transition bounds so index access never goes out of range.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `CountNumbersWithUniqueDigits.java` contains the correct class name and Java method signature.
- `CountNumbersWithUniqueDigitsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `CountNumbersWithUniqueDigits.java` - blank Java starter solution
- `CountNumbersWithUniqueDigitsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
