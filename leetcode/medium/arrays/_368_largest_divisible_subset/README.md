# 368. Largest Divisible Subset

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/368_largest_divisible_subset`
- Folder Name: `368_largest_divisible_subset`
- Official Link: https://leetcode.com/problems/largest-divisible-subset/

## Problem Overview
You are given a set of distinct positive integers nums , return the largest subset answer such that every pair (answer[i], answer[j]) of elements in this subset satisfies
If there are multiple solutions, return any of them.

## Java Starter Signature
```java
public List<Integer> largestDivisibleSubset(int[] nums)
```

## Suggested Test Cases
1. `nums = [1,2,3]` -> `[1,2]`
2. `nums = [1,2,4,8]` -> `[1,2,4,8]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LargestDivisibleSubset.java` contains the correct class name and Java method signature.
- `LargestDivisibleSubsetTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LargestDivisibleSubset.java` - blank Java starter solution
- `LargestDivisibleSubsetTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
