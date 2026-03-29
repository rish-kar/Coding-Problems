# 47. Permutations II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/backtracking/47_permutations_ii`
- Folder Name: `47_permutations_ii`
- Official Link: https://leetcode.com/problems/permutations-ii/

## Problem Overview
You are given a collection of numbers, nums , that might contain duplicates, return all possible unique permutations in any order .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public List<List<Integer>> permuteUnique(int[] nums)
```

## Suggested Test Cases
1. `nums = [1,1,2]` -> `[[1,1,2], [1,2,1], [2,1,1]]`
2. `nums = [1,2,3]` -> `[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PermutationsII.java` contains the correct class name and Java method signature.
- `PermutationsIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PermutationsII.java` - blank Java starter solution
- `PermutationsIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
