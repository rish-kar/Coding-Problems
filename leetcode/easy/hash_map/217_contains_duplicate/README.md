# 217. Contains Duplicate

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/hash_map/217_contains_duplicate`
- Folder Name: `217_contains_duplicate`
- Official Link: https://leetcode.com/problems/contains-duplicate/

## Problem Overview
You are given an integer array nums , return true if any value appears at least twice in the array, and return false if every element is distinct.
The element 1 occurs at the indices 0 and 3.

## Java Starter Signature
```java
public boolean containsDuplicate(int[] nums)
```

## Suggested Test Cases
1. `nums = [1,2,3,1]` -> `true`
2. `nums = [1,2,3,4]` -> `false`
3. `nums = [1,1,1,3,3,4,3,2,4,2]` -> `true`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ContainsDuplicate.java` contains the correct class name and Java method signature.
- `ContainsDuplicateTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ContainsDuplicate.java` - blank Java starter solution
- `ContainsDuplicateTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
