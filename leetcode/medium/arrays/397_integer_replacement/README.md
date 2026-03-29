# 397. Integer Replacement

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Dynamic Programming
- Folder Path: `leetcode/medium/arrays/397_integer_replacement`
- Folder Name: `397_integer_replacement`
- Official Link: https://leetcode.com/problems/integer-replacement/

## Problem Overview
You are given a positive integer n , you can apply one of the following operations
Return the minimum number of operations needed for n to become 1 .

## Java Starter Signature
```java
public int integerReplacement(int n)
```

## Suggested Test Cases
1. `n = 8` -> `3`
2. `n = 7` -> `4`
3. `n = 4` -> `2`

## What To Watch For
- Define state meaning before coding transitions.
- Initialize base states explicitly to avoid propagation errors.
- Verify transition bounds so index access never goes out of range.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `IntegerReplacement.java` contains the correct class name and Java method signature.
- `IntegerReplacementTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `IntegerReplacement.java` - blank Java starter solution
- `IntegerReplacementTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
