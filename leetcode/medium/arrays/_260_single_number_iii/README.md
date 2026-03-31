# 260. Single Number III

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/260_single_number_iii`
- Folder Name: `260_single_number_iii`
- Official Link: https://leetcode.com/problems/single-number-iii/

## Problem Overview
You are given an integer array nums , in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order .
You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

## Java Starter Signature
```java
public int[] singleNumber(int[] nums)
```

## Suggested Test Cases
1. `nums = [1,2,1,3,2,5]` -> `[3,5]`
2. `nums = [-1,0]` -> `[-1,0]`
3. `nums = [0,1]` -> `[1,0]`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SingleNumberIII.java` contains the correct class name and Java method signature.
- `SingleNumberIIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SingleNumberIII.java` - blank Java starter solution
- `SingleNumberIIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
