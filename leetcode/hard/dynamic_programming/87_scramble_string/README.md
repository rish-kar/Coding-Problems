# 87. Scramble String

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Strings
- Folder Path: `leetcode/hard/dynamic_programming/87_scramble_string`
- Folder Name: `87_scramble_string`
- Official Link: https://leetcode.com/problems/scramble-string/

## Problem Overview
We can scramble a string s to get a string t using the following algorithm
You are given two strings s1 and s2 of the same length , return true if s2 is a scrambled string of s1 , otherwise, return false .

## Java Starter Signature
```java
public boolean isScramble(String s1, String s2)
```

## Suggested Test Cases
1. `s1 = "great", s2 = "rgeat"` -> `true`
2. `s1 = "abcde", s2 = "caebd"` -> `false`
3. `s1 = "a", s2 = "a"` -> `true`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ScrambleString.java` contains the correct class name and Java method signature.
- `ScrambleStringTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ScrambleString.java` - blank Java starter solution
- `ScrambleStringTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
