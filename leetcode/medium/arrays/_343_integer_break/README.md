# 343. Integer Break

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Dynamic Programming
- Folder Path: `leetcode/medium/arrays/343_integer_break`
- Folder Name: `343_integer_break`
- Official Link: https://leetcode.com/problems/integer-break/

## Problem Overview
You are given an integer n , break it into the sum of k positive integers , where k >= 2 , and maximize the product of those integers.
Return the maximum product you can get .

## Java Starter Signature
```java
public int integerBreak(int n)
```

## Suggested Test Cases
1. `n = 2` -> `1`
2. `n = 10` -> `36`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Define state meaning before coding transitions.
- Initialize base states explicitly to avoid propagation errors.
- Verify transition bounds so index access never goes out of range.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `IntegerBreak.java` contains the correct class name and Java method signature.
- `IntegerBreakTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `IntegerBreak.java` - blank Java starter solution
- `IntegerBreakTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
