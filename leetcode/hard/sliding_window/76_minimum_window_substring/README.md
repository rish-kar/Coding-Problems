# 76. Minimum Window Substring

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Sliding Window
- Folder Path: `leetcode/hard/sliding_window/76_minimum_window_substring`
- Folder Name: `76_minimum_window_substring`
- Official Link: https://leetcode.com/problems/minimum-window-substring/

## Problem Overview
Return the smallest substring of s that contains every character from t with the needed counts.

## Java Starter Signature
```java
public String minWindow(String s, String t)
```


## Suggested Test Cases
1. `s = "ADOBECODEBANC", t = "ABC" -> "BANC"`
2. `s = "a", t = "a" -> "a"`
3. `s = "a", t = "aa" -> ""`

## What To Watch For
- Update the window state in the same order every time you expand or shrink.
- Character counts or last-seen positions usually matter more than the raw substring itself.
- Remember to compare answers after the final shrink or expansion step too.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MinimumWindowSubstring.java` contains the correct class name and Java method signature.
- `MinimumWindowSubstringTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MinimumWindowSubstring.java` - blank Java starter solution
- `MinimumWindowSubstringTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
