# 169. Majority Element

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/hash_map/169_majority_element`
- Folder Name: `169_majority_element`
- Official Link: https://leetcode.com/problems/majority-element/

## Problem Overview
You are given an array nums of size n , return the majority element .
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

## Java Starter Signature
```java
public int majorityElement(int[] nums)
```

## Suggested Test Cases
1. `nums = [3,2,3]` -> `3`
2. `nums = [2,2,1,1,1,2,2]` -> `2`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MajorityElement.java` contains the correct class name and Java method signature.
- `MajorityElementTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MajorityElement.java` - blank Java starter solution
- `MajorityElementTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
