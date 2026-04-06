# 118. Pascal's Triangle

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/dynamic_programming/118_pascals_triangle`
- Folder Name: `118_pascals_triangle`
- Official Link: https://leetcode.com/problems/pascals-triangle/

## Problem Overview
You are given an integer numRows , return the first numRows of Pascal's triangle .
In Pascal's triangle , each number is the sum of the two numbers directly above it as shown

## Java Starter Signature
```java
public List<List<Integer>> generate(int numRows)
```

## Suggested Test Cases
1. `numRows = 5` -> `[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]`
2. `numRows = 1` -> `[[1]]`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PascalSTriangle.java` contains the correct class name and Java method signature.
- `PascalSTriangleTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PascalSTriangle.java` - blank Java starter solution
- `PascalSTriangleTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
