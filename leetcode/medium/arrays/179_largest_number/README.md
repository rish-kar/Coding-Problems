# 179. Largest Number

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/arrays/179_largest_number`
- Folder Name: `179_largest_number`
- Official Link: https://leetcode.com/problems/largest-number/

## Problem Overview
You are given a list of non-negative integers nums , arrange them such that they form the largest number and return it.
Since the result may be very large, so you need to return a string instead of an integer.

## Java Starter Signature
```java
public String largestNumber(int[] nums)
```

## Suggested Test Cases
1. `nums = [10,2]` -> `"210"`
2. `nums = [3,30,34,5,9]` -> `"9534330"`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LargestNumber.java` contains the correct class name and Java method signature.
- `LargestNumberTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LargestNumber.java` - blank Java starter solution
- `LargestNumberTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
