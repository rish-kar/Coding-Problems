# 85. Maximal Rectangle

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Monotonic Stack
- Folder Path: `leetcode/hard/monotonic_stack/85_maximal_rectangle`
- Folder Name: `85_maximal_rectangle`
- Official Link: https://leetcode.com/problems/maximal-rectangle/

## Problem Overview
Return the area of the largest rectangle containing only 1s in the binary matrix.

## Java Starter Signature
```java
public int maximalRectangle(char[][] matrix)
```


## Suggested Test Cases
1. `matrix = sample grid -> 6`
2. `matrix = [["0"]] -> 0`
3. `matrix = [["1"]] -> 1`

## What To Watch For
- Be explicit about whether the stack stays increasing or decreasing.
- Equal values can change whether you pop now or later, so choose one rule and keep it consistent.
- Many stack area problems require a final cleanup pass after the main scan.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MaximalRectangle.java` contains the correct class name and Java method signature.
- `MaximalRectangleTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MaximalRectangle.java` - blank Java starter solution
- `MaximalRectangleTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
