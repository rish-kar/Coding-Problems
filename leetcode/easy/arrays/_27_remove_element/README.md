# 27. Remove Element

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/arrays/27_remove_element`
- Folder Name: `27_remove_element`
- Official Link: https://leetcode.com/problems/remove-element/

## Problem Overview
You are given an integer array nums and an integer val , remove all occurrences of val in nums in-place . The order of the elements may be changed. Then return the number of elements in nums which are not equal to val .
Consider the number of elements in nums which are not equal to val be k , to get accepted, you need to do the following things

## Java Starter Signature
```java
public int removeElement(int[] nums, int val)
```

## Suggested Test Cases
1. `nums = [3,2,2,3], val = 3` -> `2, nums = [2,2,_,_]`
2. `nums = [0,1,2,2,3,0,4,2], val = 2` -> `5, nums = [0,1,4,0,3,_,_,_]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RemoveElement.java` contains the correct class name and Java method signature.
- `RemoveElementTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RemoveElement.java` - blank Java starter solution
- `RemoveElementTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
