# 85. Maximal Rectangle

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/monotonic_stack/85_maximal_rectangle`
- Folder Name: `85_maximal_rectangle`
- Official Link: https://leetcode.com/problems/maximal-rectangle/

## Problem Overview
You are given a rows x cols binary matrix filled with 0 's and 1 's, find the largest rectangle containing only 1 's and return its area .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int maximalRectangle(char[][] matrix)
```

## Suggested Test Cases
1. `matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]` -> `6`
2. `matrix = [["0"]]` -> `0`
3. `matrix = [["1"]]` -> `1`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MaximalRectangle.java` contains the correct class name and Java method signature.
- `MaximalRectangleTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MaximalRectangle.java` - blank Java starter solution
- `MaximalRectangleTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
