# 395. Longest Substring with At Least K Repeating Characters

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/binary_search_tree/395_longest_substring_with_at_least_k_repeating_characters`
- Folder Name: `395_longest_substring_with_at_least_k_repeating_characters`
- Official Link: https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/

## Problem Overview
You are given a string s and an integer k , return the length of the longest substring of s such that the frequency of each character in this substring is greater than or equal to k .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int longestSubstring(String s, int k)
```

## Suggested Test Cases
1. `s = "aaabb", k = 3` -> `3`
2. `s = "ababbc", k = 2` -> `5`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LongestSubstringWithAtLeastKRepeatingCharacters.java` contains the correct class name and Java method signature.
- `LongestSubstringWithAtLeastKRepeatingCharactersTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LongestSubstringWithAtLeastKRepeatingCharacters.java` - blank Java starter solution
- `LongestSubstringWithAtLeastKRepeatingCharactersTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
