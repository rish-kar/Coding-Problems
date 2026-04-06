# 97. Interleaving String

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/dynamic_programming/97_interleaving_string`
- Folder Name: `97_interleaving_string`
- Official Link: https://leetcode.com/problems/interleaving-string/

## Problem Overview
You are given strings s1 , s2 , and s3 , find whether s3 is formed by an interleaving of s1 and s2 .
An interleaving of two strings s and t is a configuration where s and t are divided into n and m substrings respectively, such that

## Java Starter Signature
```java
public boolean isInterleave(String s1, String s2, String s3)
```

## Suggested Test Cases
1. `s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"` -> `true`
2. `s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"` -> `false`
3. `s1 = "", s2 = "", s3 = ""` -> `true`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `InterleavingString.java` contains the correct class name and Java method signature.
- `InterleavingStringTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `InterleavingString.java` - blank Java starter solution
- `InterleavingStringTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
