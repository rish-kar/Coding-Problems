# 162. Find Peak Element

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/binary_search/162_find_peak_element`
- Folder Name: `162_find_peak_element`
- Official Link: https://leetcode.com/problems/find-peak-element/

## Problem Overview
A peak element is an element that is strictly greater than its neighbors.
You are given a 0-indexed integer array nums , find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks .

## Java Starter Signature
```java
public int findPeakElement(int[] nums)
```

## Suggested Test Cases
1. `nums = [1,2,3,1]` -> `2`
2. `nums = [1,2,1,3,5,6,4]` -> `5`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `FindPeakElement.java` contains the correct class name and Java method signature.
- `FindPeakElementTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `FindPeakElement.java` - blank Java starter solution
- `FindPeakElementTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
