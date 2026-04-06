# 239. Sliding Window Maximum

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/arrays/239_sliding_window_maximum`
- Folder Name: `239_sliding_window_maximum`
- Official Link: https://leetcode.com/problems/sliding-window-maximum/

## Problem Overview
You are given an array of integers nums , there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int[] maxSlidingWindow(int[] nums, int k)
```

## Suggested Test Cases
1. `nums = [1,3,-1,-3,5,3,6,7], k = 3` -> `[3,3,5,5,6,7]`
2. `nums = [1], k = 1` -> `[1]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SlidingWindowMaximum.java` contains the correct class name and Java method signature.
- `SlidingWindowMaximumTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SlidingWindowMaximum.java` - blank Java starter solution
- `SlidingWindowMaximumTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
