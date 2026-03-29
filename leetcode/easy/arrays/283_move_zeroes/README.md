# 283. Move Zeroes

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/arrays/283_move_zeroes`
- Folder Name: `283_move_zeroes`
- Official Link: https://leetcode.com/problems/move-zeroes/

## Problem Overview
You are given an integer array nums , move all 0 's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

## Java Starter Signature
```java
public void moveZeroes(int[] nums)
```

## Suggested Test Cases
1. `nums = [0,1,0,3,12]` -> `[1,3,12,0,0]`
2. `nums = [0]` -> `[0]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MoveZeroes.java` contains the correct class name and Java method signature.
- `MoveZeroesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MoveZeroes.java` - blank Java starter solution
- `MoveZeroesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
