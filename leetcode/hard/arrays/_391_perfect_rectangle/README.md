# 391. Perfect Rectangle

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/arrays/391_perfect_rectangle`
- Folder Name: `391_perfect_rectangle`
- Official Link: https://leetcode.com/problems/perfect-rectangle/

## Problem Overview
You are given an array rectangles where rectangles[i] = [x i , y i , a i , b i ] represents an axis-aligned rectangle. The bottom-left point of the rectangle is (x i , y i ) and the top-right point of it is (a i , b i ) .
Return true if all the rectangles together form an exact cover of a rectangular region .

## Java Starter Signature
```java
public boolean isRectangleCover(int[][] rectangles)
```

## Suggested Test Cases
1. `rectangles = [[1,1,3,3],[3,1,4,2],[3,2,4,4],[1,3,2,4],[2,3,3,4]]` -> `true`
2. `rectangles = [[1,1,2,3],[1,3,2,4],[3,1,4,2],[3,2,4,4]]` -> `false`
3. `rectangles = [[1,1,3,3],[3,1,4,2],[1,3,2,4],[2,2,4,4]]` -> `false`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PerfectRectangle.java` contains the correct class name and Java method signature.
- `PerfectRectangleTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PerfectRectangle.java` - blank Java starter solution
- `PerfectRectangleTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
