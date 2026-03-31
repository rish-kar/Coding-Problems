# 10. Regular Expression Matching

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Strings
- Folder Path: `leetcode/hard/dynamic_programming/10_regular_expression_matching`
- Folder Name: `10_regular_expression_matching`
- Official Link: https://leetcode.com/problems/regular-expression-matching/

## Problem Overview
You are given an input string s and a pattern p , implement regular expression matching with support for '.' and '*' where
Return a boolean indicating whether the matching covers the entire input string (not partial).

## Java Starter Signature
```java
public boolean isMatch(String s, String p)
```

## Suggested Test Cases
1. `s = "aa", p = "a"` -> `false`
2. `s = "aa", p = "a*"` -> `true`
3. `s = "ab", p = ".*"` -> `true`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RegularExpressionMatching.java` contains the correct class name and Java method signature.
- `RegularExpressionMatchingTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RegularExpressionMatching.java` - blank Java starter solution
- `RegularExpressionMatchingTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
