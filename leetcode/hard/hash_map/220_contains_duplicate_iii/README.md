# 220. Contains Duplicate III

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/hash_map/220_contains_duplicate_iii`
- Folder Name: `220_contains_duplicate_iii`
- Official Link: https://leetcode.com/problems/contains-duplicate-iii/

## Problem Overview
You are given an integer array nums and two integers indexDiff and valueDiff .
Find a pair of indices (i, j) such that

## Java Starter Signature
```java
public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff)
```

## Suggested Test Cases
1. `nums = [1,2,3,1], indexDiff = 3, valueDiff = 0` -> `true`
2. `nums = [1,5,9,1,5,9], indexDiff = 2, valueDiff = 3` -> `false`
3. `nums = []` -> `false`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ContainsDuplicateIII.java` contains the correct class name and Java method signature.
- `ContainsDuplicateIIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ContainsDuplicateIII.java` - blank Java starter solution
- `ContainsDuplicateIIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
