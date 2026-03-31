# 22. Generate Parentheses

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/backtracking/22_generate_parentheses`
- Folder Name: `22_generate_parentheses`
- Official Link: https://leetcode.com/problems/generate-parentheses/

## Problem Overview
You are given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public List<String> generateParenthesis(int n)
```

## Suggested Test Cases
1. `n = 3` -> `["((()))","(()())","(())()","()(())","()()()"]`
2. `n = 1` -> `["()"]`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `GenerateParentheses.java` contains the correct class name and Java method signature.
- `GenerateParenthesesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `GenerateParentheses.java` - blank Java starter solution
- `GenerateParenthesesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
