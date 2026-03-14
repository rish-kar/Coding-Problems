# 22. Generate Parentheses

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Backtracking
- Folder Path: `leetcode/medium/backtracking/22_generate_parentheses`
- Folder Name: `22_generate_parentheses`
- Official Link: https://leetcode.com/problems/generate-parentheses/

## Problem Overview
Generate every well-formed parentheses string that uses n pairs.

## Java Starter Signature
```java
public List<String> generateParenthesis(int n)
```


## Suggested Test Cases
1. `n = 3 -> ["((()))","(()())","(())()","()(())","()()()"]`
2. `n = 1 -> ["()"]`
3. `n = 2 -> ["(())","()()"]`

## What To Watch For
- Define the stopping condition first so you know exactly when to record an answer.
- Undo each choice after the recursive call so the next branch starts cleanly.
- If duplicates are possible, decide where to prune them before recursion explodes.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `GenerateParentheses.java` contains the correct class name and Java method signature.
- `GenerateParenthesesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `GenerateParentheses.java` - blank Java starter solution
- `GenerateParenthesesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
