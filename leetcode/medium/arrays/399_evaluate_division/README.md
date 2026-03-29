# 399. Evaluate Division

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/arrays/399_evaluate_division`
- Folder Name: `399_evaluate_division`
- Official Link: https://leetcode.com/problems/evaluate-division/

## Problem Overview
You are given an array of variable pairs equations and an array of real numbers values , where equations[i] = [A i , B i ] and values[i] represent the equation A i / B i = values[i] . Each A i or B i is a string that represents a single variable.
You are also given some queries , where queries[j] = [C j , D j ] represents the j th query where you must find the answer for C j / D j = ? .

## Java Starter Signature
```java
public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries)
```

## Suggested Test Cases
1. `equations = [["a","b"],["b","c"]], values = [2.0,3.0], queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]` -> `[6.00000,0.50000,-1.00000,1.00000,-1.00000]`
2. `equations = [["a","b"],["b","c"],["bc","cd"]], values = [1.5,2.5,5.0], queries = [["a","c"],["c","b"],["bc","cd"],["cd","bc"]]` -> `[3.75000,0.40000,5.00000,0.20000]`
3. `equations = [["a","b"]], values = [0.5], queries = [["a","b"],["b","a"],["a","c"],["x","y"]]` -> `[0.50000,2.00000,-1.00000,-1.00000]`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `EvaluateDivision.java` contains the correct class name and Java method signature.
- `EvaluateDivisionTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `EvaluateDivision.java` - blank Java starter solution
- `EvaluateDivisionTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
