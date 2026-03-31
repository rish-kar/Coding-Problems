# 1920. Build Array from Permutation

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/arrays/1920_build_array_from_permutation`
- Folder Name: `1920_build_array_from_permutation`
- Official Link: https://leetcode.com/problems/build-array-from-permutation/

## Problem Overview
You are given a zero-based permutation nums ( 0-indexed ), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 and return it.
A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 ( inclusive ).

## Java Starter Signature
```java
public int[] buildArray(int[] nums)
```

## Suggested Test Cases
1. `nums = [0,2,1,5,3,4]` -> `[0,1,2,4,5,3]`
2. `nums = [5,0,1,2,3,4]` -> `[4,5,0,1,2,3]`
3. `nums = [0]` -> `0`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BuildArrayFromPermutation.java` contains the correct class name and Java method signature.
- `BuildArrayFromPermutationTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BuildArrayFromPermutation.java` - blank Java starter solution
- `BuildArrayFromPermutationTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
