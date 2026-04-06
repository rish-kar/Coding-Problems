# 3. Longest Substring Without Repeating Characters

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/sliding_window/3_longest_substring_without_repeating_characters`
- Folder Name: `3_longest_substring_without_repeating_characters`
- Official Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/

## Problem Overview
You are given a string s , find the length of the longest substring without duplicate characters.
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int lengthOfLongestSubstring(String s)
```

## Suggested Test Cases
1. `s = "abcabcbb"` -> `3`
2. `s = "bbbbb"` -> `1`
3. `s = "pwwkew"` -> `3`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LongestSubstringWithoutRepeatingCharacters.java` contains the correct class name and Java method signature.
- `LongestSubstringWithoutRepeatingCharactersTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LongestSubstringWithoutRepeatingCharacters.java` - blank Java starter solution
- `LongestSubstringWithoutRepeatingCharactersTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
