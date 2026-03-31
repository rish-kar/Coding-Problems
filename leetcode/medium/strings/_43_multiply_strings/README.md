# 43. Multiply Strings

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/strings/43_multiply_strings`
- Folder Name: `43_multiply_strings`
- Official Link: https://leetcode.com/problems/multiply-strings/

## Problem Overview
You are given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2 , also represented as a string.
Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

## Java Starter Signature
```java
public String multiply(String num1, String num2)
```

## Suggested Test Cases
1. `num1 = "2", num2 = "3"` -> `"6"`
2. `num1 = "123", num2 = "456"` -> `"56088"`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MultiplyStrings.java` contains the correct class name and Java method signature.
- `MultiplyStringsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MultiplyStrings.java` - blank Java starter solution
- `MultiplyStringsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
