# 167. Two Sum II - Input Array Is Sorted

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/two_pointers/167_two_sum_ii_input_array_is_sorted`
- Folder Name: `167_two_sum_ii_input_array_is_sorted`
- Official Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

## Problem Overview
You are given a 1-indexed array of integers numbers that is already sorted in non-decreasing order , find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index 1 ] and numbers[index 2 ] where 1 1 2 .
Return the indices of the two numbers index 1 and index 2 , each incremented by one, as an integer array [index 1 , index 2 ] of length 2.

## Java Starter Signature
```java
public int[] twoSum(int[] numbers, int target)
```

## Suggested Test Cases
1. `numbers = [ 2 , 7 ,11,15], target = 9` -> `[1,2]`
2. `numbers = [ 2 ,3, 4 ], target = 6` -> `[1,3]`
3. `numbers = [ -1 , 0 ], target = -1` -> `[1,2]`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `TwoSumIIInputArrayIsSorted.java` contains the correct class name and Java method signature.
- `TwoSumIIInputArrayIsSortedTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `TwoSumIIInputArrayIsSorted.java` - blank Java starter solution
- `TwoSumIIInputArrayIsSortedTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
