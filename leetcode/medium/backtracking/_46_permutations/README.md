# 46. Permutations

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/backtracking/46_permutations`
- Folder Name: `46_permutations`
- Official Link: https://leetcode.com/problems/permutations/

## Problem Overview
You are given an array nums of distinct integers, return all the possible permutations . You can return the answer in any order .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public List<List<Integer>> permute(int[] nums)
```

## Suggested Test Cases
1. `nums = [1,2,3]` -> `[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]`
2. `nums = [0,1]` -> `[[0,1],[1,0]]`
3. `nums = [1]` -> `[[1]]`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `Permutations.java` contains the correct class name and Java method signature.
- `PermutationsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `Permutations.java` - blank Java starter solution
- `PermutationsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
