# 76. Minimum Window Substring

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Strings
- Folder Path: `leetcode/hard/sliding_window/76_minimum_window_substring`
- Folder Name: `76_minimum_window_substring`
- Official Link: https://leetcode.com/problems/minimum-window-substring/

## Problem Overview
You are given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t ( including duplicates ) is included in the window . If there is no such substring, return the empty string "" .
The testcases will be generated such that the answer is unique .

## Java Starter Signature
```java
public String minWindow(String s, String t)
```

## Suggested Test Cases
1. `s = "ADOBECODEBANC", t = "ABC"` -> `"BANC"`
2. `s = "a", t = "a"` -> `"a"`
3. `s = "a", t = "aa"` -> `""`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MinimumWindowSubstring.java` contains the correct class name and Java method signature.
- `MinimumWindowSubstringTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MinimumWindowSubstring.java` - blank Java starter solution
- `MinimumWindowSubstringTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
