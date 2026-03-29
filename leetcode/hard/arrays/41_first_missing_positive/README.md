# 41. First Missing Positive

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/arrays/41_first_missing_positive`
- Folder Name: `41_first_missing_positive`
- Official Link: https://leetcode.com/problems/first-missing-positive/

## Problem Overview
You are given an unsorted integer array nums . Then return the smallest positive integer that is not present in nums .
You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

## Java Starter Signature
```java
public int firstMissingPositive(int[] nums)
```

## Suggested Test Cases
1. `nums = [1,2,0]` -> `3`
2. `nums = [3,4,-1,1]` -> `2`
3. `nums = [7,8,9,11,12]` -> `1`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `FirstMissingPositive.java` contains the correct class name and Java method signature.
- `FirstMissingPositiveTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `FirstMissingPositive.java` - blank Java starter solution
- `FirstMissingPositiveTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
