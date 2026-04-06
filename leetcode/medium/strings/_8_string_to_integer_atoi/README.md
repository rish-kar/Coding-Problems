# 8. String to Integer (atoi)

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/strings/8_string_to_integer_atoi`
- Folder Name: `8_string_to_integer_atoi`
- Official Link: https://leetcode.com/problems/string-to-integer-atoi/

## Problem Overview
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
The algorithm for myAtoi(string s) is as follows

## Java Starter Signature
```java
public int myAtoi(String s)
```

## Suggested Test Cases
1. `s = "42"` -> `42`
2. `s = " -042"` -> `-42`
3. `s = "1337c0d3"` -> `1337`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `StringToIntegerAtoi.java` contains the correct class name and Java method signature.
- `StringToIntegerAtoiTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `StringToIntegerAtoi.java` - blank Java starter solution
- `StringToIntegerAtoiTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
