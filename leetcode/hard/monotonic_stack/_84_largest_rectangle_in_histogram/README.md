# 84. Largest Rectangle in Histogram

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/monotonic_stack/84_largest_rectangle_in_histogram`
- Folder Name: `84_largest_rectangle_in_histogram`
- Official Link: https://leetcode.com/problems/largest-rectangle-in-histogram/

## Problem Overview
You are given an array of integers heights representing the histogram's bar height where the width of each bar is 1 , return the area of the largest rectangle in the histogram .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int largestRectangleArea(int[] heights)
```

## Suggested Test Cases
1. `heights = [2,1,5,6,2,3]` -> `10`
2. `heights = [2,4]` -> `4`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LargestRectangleInHistogram.java` contains the correct class name and Java method signature.
- `LargestRectangleInHistogramTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LargestRectangleInHistogram.java` - blank Java starter solution
- `LargestRectangleInHistogramTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
