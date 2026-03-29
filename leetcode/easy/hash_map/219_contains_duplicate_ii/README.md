# 219. Contains Duplicate II

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/hash_map/219_contains_duplicate_ii`
- Folder Name: `219_contains_duplicate_ii`
- Official Link: https://leetcode.com/problems/contains-duplicate-ii/

## Problem Overview
You are given an integer array nums and an integer k , return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public boolean containsNearbyDuplicate(int[] nums, int k)
```

## Suggested Test Cases
1. `nums = [1,2,3,1], k = 3` -> `true`
2. `nums = [1,0,1,1], k = 1` -> `true`
3. `nums = [1,2,3,1,2,3], k = 2` -> `false`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ContainsDuplicateII.java` contains the correct class name and Java method signature.
- `ContainsDuplicateIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ContainsDuplicateII.java` - blank Java starter solution
- `ContainsDuplicateIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
