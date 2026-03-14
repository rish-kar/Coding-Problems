# 8. String to Integer (atoi)

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/strings/8_string_to_integer_atoi`
- Folder Name: `8_string_to_integer_atoi`
- Official Link: https://leetcode.com/problems/string-to-integer-atoi/

## Problem Overview
Parse the string like the classic atoi function while handling whitespace, sign characters, invalid trailing content, and overflow.

## Java Starter Signature
```java
public int myAtoi(String s)
```


## Suggested Test Cases
1. `s = "42" -> 42`
2. `s = "   -42" -> -42`
3. `s = "4193 with words" -> 4193`

## What To Watch For
- Pay close attention to spaces, punctuation, repeated characters, and empty-string behavior.
- Parsing problems usually have a strict order of operations, so handle sign and invalid input carefully.
- When building a result string, think about whether repeated concatenation should be avoided.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `StringToIntegerAtoi.java` contains the correct class name and Java method signature.
- `StringToIntegerAtoiTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `StringToIntegerAtoi.java` - blank Java starter solution
- `StringToIntegerAtoiTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
