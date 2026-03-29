# 75. Sort Colors

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/two_pointers/75_sort_colors`
- Folder Name: `75_sort_colors`
- Official Link: https://leetcode.com/problems/sort-colors/

## Problem Overview
You are given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0 , 1 , and 2 to represent the color red, white, and blue, respectively.

## Java Starter Signature
```java
public void sortColors(int[] nums)
```

## Suggested Test Cases
1. `nums = [2,0,2,1,1,0]` -> `[0,0,1,1,2,2]`
2. `nums = [2,0,1]` -> `[0,1,2]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SortColors.java` contains the correct class name and Java method signature.
- `SortColorsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SortColors.java` - blank Java starter solution
- `SortColorsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
