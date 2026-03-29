# 119. Pascal's Triangle II

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/dynamic_programming/119_pascals_triangle_ii`
- Folder Name: `119_pascals_triangle_ii`
- Official Link: https://leetcode.com/problems/pascals-triangle-ii/

## Problem Overview
You are given an integer rowIndex , return the rowIndex th ( 0-indexed ) row of the Pascal's triangle .
In Pascal's triangle , each number is the sum of the two numbers directly above it as shown

## Java Starter Signature
```java
public List<Integer> getRow(int rowIndex)
```

## Suggested Test Cases
1. `rowIndex = 3` -> `[1,3,3,1]`
2. `rowIndex = 0` -> `[1]`
3. `rowIndex = 1` -> `[1,1]`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PascalSTriangleII.java` contains the correct class name and Java method signature.
- `PascalSTriangleIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PascalSTriangleII.java` - blank Java starter solution
- `PascalSTriangleIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
