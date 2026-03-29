# 150. Evaluate Reverse Polish Notation

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/stack/150_evaluate_reverse_polish_notation`
- Folder Name: `150_evaluate_reverse_polish_notation`
- Official Link: https://leetcode.com/problems/evaluate-reverse-polish-notation/

## Problem Overview
You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation .
Evaluate the expression. Then return an integer that represents the value of the expression .

## Java Starter Signature
```java
public int evalRPN(String[] tokens)
```

## Suggested Test Cases
1. `tokens = ["2","1","+","3","*"]` -> `9`
2. `tokens = ["4","13","5","/","+"]` -> `6`
3. `tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]` -> `22`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `EvaluateReversePolishNotation.java` contains the correct class name and Java method signature.
- `EvaluateReversePolishNotationTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `EvaluateReversePolishNotation.java` - blank Java starter solution
- `EvaluateReversePolishNotationTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
