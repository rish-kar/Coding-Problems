# 164. Maximum Gap

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/164_maximum_gap`
- Folder Name: `164_maximum_gap`
- Official Link: https://leetcode.com/problems/maximum-gap/

## Problem Overview
You are given an integer array nums , return the maximum difference between two successive elements in its sorted form . If the array contains less than two elements, return 0 .
You must write an algorithm that runs in linear time and uses linear extra space.

## Java Starter Signature
```java
public int maximumGap(int[] nums)
```

## Suggested Test Cases
1. `nums = [3,6,9,1]` -> `3`
2. `nums = [10]` -> `0`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MaximumGap.java` contains the correct class name and Java method signature.
- `MaximumGapTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MaximumGap.java` - blank Java starter solution
- `MaximumGapTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
