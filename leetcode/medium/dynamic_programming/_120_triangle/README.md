# 120. Triangle

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/dynamic_programming/120_triangle`
- Folder Name: `120_triangle`
- Official Link: https://leetcode.com/problems/triangle/

## Problem Overview
You are given a triangle array, return the minimum path sum from top to bottom .
For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.

## Java Starter Signature
```java
public int minimumTotal(List<List<Integer>> triangle)
```

## Suggested Test Cases
1. `triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]` -> `11`
2. `triangle = [[-10]]` -> `-10`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `Triangle.java` contains the correct class name and Java method signature.
- `TriangleTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `Triangle.java` - blank Java starter solution
- `TriangleTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
