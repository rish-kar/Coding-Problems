# 31. Next Permutation

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/31_next_permutation`
- Folder Name: `31_next_permutation`
- Official Link: https://leetcode.com/problems/next-permutation/

## Problem Overview
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

## Java Starter Signature
```java
public void nextPermutation(int[] nums)
```

## Suggested Test Cases
1. `nums = [1,2,3]` -> `[1,3,2]`
2. `nums = [3,2,1]` -> `[1,2,3]`
3. `nums = [1,1,5]` -> `[1,5,1]`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `NextPermutation.java` contains the correct class name and Java method signature.
- `NextPermutationTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `NextPermutation.java` - blank Java starter solution
- `NextPermutationTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
