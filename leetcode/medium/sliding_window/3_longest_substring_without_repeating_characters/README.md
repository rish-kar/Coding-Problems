# 3. Longest Substring Without Repeating Characters

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Sliding Window
- Folder Path: `leetcode/medium/sliding_window/3_longest_substring_without_repeating_characters`
- Folder Name: `3_longest_substring_without_repeating_characters`
- Official Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/

## Problem Overview
Return the length of the longest substring that contains no repeated characters.

## Java Starter Signature
```java
public int lengthOfLongestSubstring(String s)
```


## Suggested Test Cases
1. `s = "abcabcbb" -> 3`
2. `s = "bbbbb" -> 1`
3. `s = "pwwkew" -> 3`

## What To Watch For
- Update the window state in the same order every time you expand or shrink.
- Character counts or last-seen positions usually matter more than the raw substring itself.
- Remember to compare answers after the final shrink or expansion step too.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LongestSubstringWithoutRepeatingCharacters.java` contains the correct class name and Java method signature.
- `LongestSubstringWithoutRepeatingCharactersTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LongestSubstringWithoutRepeatingCharacters.java` - blank Java starter solution
- `LongestSubstringWithoutRepeatingCharactersTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
