# 20. Valid Parentheses

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Strings
- Folder Path: `leetcode/easy/stack/20_valid_parentheses`
- Folder Name: `20_valid_parentheses`
- Official Link: https://leetcode.com/problems/valid-parentheses/

## Problem Overview
Validate whether each opening bracket in the string is closed by the correct type in the correct order.
Return `true` only when the full string is balanced after processing every character.

## Java Starter Signature
```java
public boolean isValid(String s)
```

## Suggested Test Cases
1. `s = "()"` -> `true`
2. `s = "()[]{}"` -> `true`
3. `s = "(]"` -> `false`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ValidParentheses.java` contains the correct class name and Java method signature.
- `ValidParenthesesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ValidParentheses.java` - blank Java starter solution
- `ValidParenthesesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
