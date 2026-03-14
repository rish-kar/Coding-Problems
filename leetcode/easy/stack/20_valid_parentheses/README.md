# 20. Valid Parentheses

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Stack
- Folder Path: `leetcode/easy/stack/20_valid_parentheses`
- Folder Name: `20_valid_parentheses`
- Official Link: https://leetcode.com/problems/valid-parentheses/

## Problem Overview
Check whether every bracket opens and closes in the correct order.

## Java Starter Signature
```java
public boolean isValid(String s)
```


## Suggested Test Cases
1. `s = "()" -> true`
2. `s = "()[]{}" -> true`
3. `s = "(]" -> false`

## What To Watch For
- A stack is only helpful if you know what invariant each element represents.
- Unmatched opening and closing symbols should be handled explicitly.
- Do not forget any cleanup step after the main scan finishes.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ValidParentheses.java` contains the correct class name and Java method signature.
- `ValidParenthesesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ValidParentheses.java` - blank Java starter solution
- `ValidParenthesesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
