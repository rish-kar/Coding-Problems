# 287. Find the Duplicate Number

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/287_find_the_duplicate_number`
- Folder Name: `287_find_the_duplicate_number`
- Official Link: https://leetcode.com/problems/find-the-duplicate-number/

## Problem Overview
You are given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums , return this repeated number .

## Java Starter Signature
```java
public int findDuplicate(int[] nums)
```

## Suggested Test Cases
1. `nums = [1,3,4,2,2]` -> `2`
2. `nums = [3,1,3,4,2]` -> `3`
3. `nums = [3,3,3,3,3]` -> `3`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `FindTheDuplicateNumber.java` contains the correct class name and Java method signature.
- `FindTheDuplicateNumberTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `FindTheDuplicateNumber.java` - blank Java starter solution
- `FindTheDuplicateNumberTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
