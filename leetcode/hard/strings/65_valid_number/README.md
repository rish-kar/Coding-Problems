# 65. Valid Number

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Strings
- Folder Path: `leetcode/hard/strings/65_valid_number`
- Folder Name: `65_valid_number`
- Official Link: https://leetcode.com/problems/valid-number/

## Problem Overview
You are given a string s , return whether s is a valid number . For example, all the following are valid numbers: "2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789" , while the following are not valid numbers: "abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53" .
Formally, a valid number is defined using one of the following definitions

## Java Starter Signature
```java
public boolean isNumber(String s)
```

## Suggested Test Cases
1. `s = "0"` -> `true`
2. `s = "e"` -> `false`
3. `s = "."` -> `false`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ValidNumber.java` contains the correct class name and Java method signature.
- `ValidNumberTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ValidNumber.java` - blank Java starter solution
- `ValidNumberTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
