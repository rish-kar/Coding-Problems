# 44. Wildcard Matching

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Strings
- Folder Path: `leetcode/hard/dynamic_programming/44_wildcard_matching`
- Folder Name: `44_wildcard_matching`
- Official Link: https://leetcode.com/problems/wildcard-matching/

## Problem Overview
You are given an input string ( s ) and a pattern ( p ), implement wildcard pattern matching with support for '?' and '*' where
The matching should cover the entire input string (not partial).

## Java Starter Signature
```java
public boolean isMatch(String s, String p)
```

## Suggested Test Cases
1. `s = "aa", p = "a"` -> `false`
2. `s = "aa", p = "*"` -> `true`
3. `s = "cb", p = "?a"` -> `false`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `WildcardMatching.java` contains the correct class name and Java method signature.
- `WildcardMatchingTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `WildcardMatching.java` - blank Java starter solution
- `WildcardMatchingTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
