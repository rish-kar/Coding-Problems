# 84. Largest Rectangle in Histogram

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Monotonic Stack
- Folder Path: `leetcode/hard/monotonic_stack/84_largest_rectangle_in_histogram`
- Folder Name: `84_largest_rectangle_in_histogram`
- Official Link: https://leetcode.com/problems/largest-rectangle-in-histogram/

## Problem Overview
Return the largest rectangle area that can be formed within the histogram.

## Java Starter Signature
```java
public int largestRectangleArea(int[] heights)
```


## Suggested Test Cases
1. `heights = [2,1,5,6,2,3] -> 10`
2. `heights = [2,4] -> 4`
3. `heights = [1,1] -> 2`

## What To Watch For
- Be explicit about whether the stack stays increasing or decreasing.
- Equal values can change whether you pop now or later, so choose one rule and keep it consistent.
- Many stack area problems require a final cleanup pass after the main scan.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LargestRectangleInHistogram.java` contains the correct class name and Java method signature.
- `LargestRectangleInHistogramTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LargestRectangleInHistogram.java` - blank Java starter solution
- `LargestRectangleInHistogramTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
