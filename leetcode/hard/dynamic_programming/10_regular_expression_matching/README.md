# 10. Regular Expression Matching

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Dynamic Programming
- Folder Path: `leetcode/hard/dynamic_programming/10_regular_expression_matching`
- Folder Name: `10_regular_expression_matching`
- Official Link: https://leetcode.com/problems/regular-expression-matching/

## Problem Overview
Match the full string against a pattern that supports '.' for any character and '*' for zero or more of the previous character.

## Java Starter Signature
```java
public boolean isMatch(String s, String p)
```


## Suggested Test Cases
1. `s = "aa", p = "a" -> false`
2. `s = "aa", p = "a*" -> true`
3. `s = "ab", p = ".*" -> true`

## What To Watch For
- Base cases matter because every later state depends on them.
- Write down the transition clearly before coding so each state means exactly one thing.
- Check whether the answer belongs at the final cell, the final index, or the best value seen anywhere.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RegularExpressionMatching.java` contains the correct class name and Java method signature.
- `RegularExpressionMatchingTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RegularExpressionMatching.java` - blank Java starter solution
- `RegularExpressionMatchingTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
