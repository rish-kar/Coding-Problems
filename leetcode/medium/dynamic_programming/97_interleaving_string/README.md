# 97. Interleaving String

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Dynamic Programming
- Folder Path: `leetcode/medium/dynamic_programming/97_interleaving_string`
- Folder Name: `97_interleaving_string`
- Official Link: https://leetcode.com/problems/interleaving-string/

## Problem Overview
Check whether s3 can be formed by interleaving s1 and s2 while preserving the order within each source string.

## Java Starter Signature
```java
public boolean isInterleave(String s1, String s2, String s3)
```


## Suggested Test Cases
1. `s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac" -> true`
2. `s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc" -> false`
3. `s1 = "", s2 = "", s3 = "" -> true`

## What To Watch For
- Base cases matter because every later state depends on them.
- Write down the transition clearly before coding so each state means exactly one thing.
- Check whether the answer belongs at the final cell, the final index, or the best value seen anywhere.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `InterleavingString.java` contains the correct class name and Java method signature.
- `InterleavingStringTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `InterleavingString.java` - blank Java starter solution
- `InterleavingStringTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
