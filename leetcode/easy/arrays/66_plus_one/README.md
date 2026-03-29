# 66. Plus One

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/arrays/66_plus_one`
- Folder Name: `66_plus_one`
- Official Link: https://leetcode.com/problems/plus-one/

## Problem Overview
You are given a large integer represented as an integer array digits , where each digits[i] is the i th digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0 's.
Increment the large integer by one and return the resulting array of digits .

## Java Starter Signature
```java
public int[] plusOne(int[] digits)
```

## Suggested Test Cases
1. `digits = [1,2,3]` -> `[1,2,4]`
2. `digits = [4,3,2,1]` -> `[4,3,2,2]`
3. `digits = [9]` -> `[1,0]`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PlusOne.java` contains the correct class name and Java method signature.
- `PlusOneTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PlusOne.java` - blank Java starter solution
- `PlusOneTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
