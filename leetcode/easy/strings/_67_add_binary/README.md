# 67. Add Binary

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Strings
- Folder Path: `leetcode/easy/strings/67_add_binary`
- Folder Name: `67_add_binary`
- Official Link: https://leetcode.com/problems/add-binary/

## Problem Overview
You are given two binary strings a and b , return their sum as a binary string .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public String addBinary(String a, String b)
```

## Suggested Test Cases
1. `a = "11", b = "1"` -> `"100"`
2. `a = "1010", b = "1011"` -> `"10101"`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `AddBinary.java` contains the correct class name and Java method signature.
- `AddBinaryTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `AddBinary.java` - blank Java starter solution
- `AddBinaryTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
