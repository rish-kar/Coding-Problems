# 241. Different Ways to Add Parentheses

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/arrays/241_different_ways_to_add_parentheses`
- Folder Name: `241_different_ways_to_add_parentheses`
- Official Link: https://leetcode.com/problems/different-ways-to-add-parentheses/

## Problem Overview
You are given a string expression of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators . You may return the answer in any order .
The test cases are generated such that the output values fit in a 32-bit integer and the number of different results does not exceed 10 4 .

## Java Starter Signature
```java
public List<Integer> diffWaysToCompute(String expression)
```

## Suggested Test Cases
1. `expression = "2-1-1"` -> `[0,2]`
2. `expression = "2*3-4*5"` -> `[-34,-14,-10,-10,10]`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `DifferentWaysToAddParentheses.java` contains the correct class name and Java method signature.
- `DifferentWaysToAddParenthesesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `DifferentWaysToAddParentheses.java` - blank Java starter solution
- `DifferentWaysToAddParenthesesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
