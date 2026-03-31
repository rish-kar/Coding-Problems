# 306. Additive Number

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/arrays/306_additive_number`
- Folder Name: `306_additive_number`
- Official Link: https://leetcode.com/problems/additive-number/

## Problem Overview
An additive number is a string whose digits can form an additive sequence .
A valid additive sequence should contain at least three numbers. Except for the first two numbers, each subsequent number in the sequence must be the sum of the preceding two.

## Java Starter Signature
```java
public boolean isAdditiveNumber(String num)
```

## Suggested Test Cases
1. `"112358"` -> `true`
2. `"199100199"` -> `true`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `AdditiveNumber.java` contains the correct class name and Java method signature.
- `AdditiveNumberTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `AdditiveNumber.java` - blank Java starter solution
- `AdditiveNumberTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
