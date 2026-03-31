# 224. Basic Calculator

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Strings
- Folder Path: `leetcode/hard/stack/224_basic_calculator`
- Folder Name: `224_basic_calculator`
- Official Link: https://leetcode.com/problems/basic-calculator/

## Problem Overview
You are given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation .
Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval() .

## Java Starter Signature
```java
public int calculate(String s)
```

## Suggested Test Cases
1. `s = "1 + 1"` -> `2`
2. `s = " 2-1 + 2 "` -> `3`
3. `s = "(1+(4+5+2)-3)+(6+8)"` -> `23`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BasicCalculator.java` contains the correct class name and Java method signature.
- `BasicCalculatorTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BasicCalculator.java` - blank Java starter solution
- `BasicCalculatorTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
