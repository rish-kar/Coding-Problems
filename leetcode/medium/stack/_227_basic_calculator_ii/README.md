# 227. Basic Calculator II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/stack/227_basic_calculator_ii`
- Folder Name: `227_basic_calculator_ii`
- Official Link: https://leetcode.com/problems/basic-calculator-ii/

## Problem Overview
You are given a string s which represents an expression, evaluate this expression and return its value .
The integer division should truncate toward zero.

## Java Starter Signature
```java
public int calculate(String s)
```

## Suggested Test Cases
1. `s = "3+2*2"` -> `7`
2. `s = " 3/2 "` -> `1`
3. `s = " 3+5 / 2 "` -> `5`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BasicCalculatorII.java` contains the correct class name and Java method signature.
- `BasicCalculatorIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BasicCalculatorII.java` - blank Java starter solution
- `BasicCalculatorIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
