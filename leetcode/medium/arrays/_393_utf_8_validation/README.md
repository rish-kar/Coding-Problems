# 393. UTF-8 Validation

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/393_utf_8_validation`
- Folder Name: `393_utf_8_validation`
- Official Link: https://leetcode.com/problems/utf-8-validation/

## Problem Overview
You are given an integer array data representing the data, return whether it is a valid UTF-8 encoding (i.e. it translates to a sequence of valid UTF-8 encoded characters).
A character in UTF8 can be from 1 to 4 bytes long, subjected to the following rules

## Java Starter Signature
```java
public boolean validUtf8(int[] data)
```

## Suggested Test Cases
1. `data = [197,130,1]` -> `true`
2. `data = [235,140,4]` -> `false`
3. `nums = []` -> `false`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `UTFEightValidation.java` contains the correct class name and Java method signature.
- `UTFEightValidationTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `UTFEightValidation.java` - blank Java starter solution
- `UTFEightValidationTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
