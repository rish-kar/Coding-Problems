# 159. Longest Substring with At Most Two Distinct Characters

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/binary_search_tree/159_longest_substring_with_at_most_two_distinct_characters`
- Folder Name: `159_longest_substring_with_at_most_two_distinct_characters`
- Official Link: https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/

## Problem Overview
Implement the core logic for Longest Substring with At Most Two Distinct Characters exactly as the prompt defines.
Process the string input according to the matching or transformation rule in the prompt.

## Java Starter Signature
```java
public int lengthOfLongestSubstringTwoDistinct(String s)
```

## Suggested Test Cases
1. `s = ""` -> `""`
2. `s = "abc"` -> `"abc"`
3. `s = "aab"` -> `"aab"`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LongestSubstringWithAtMostTwoDistinctCharacters.java` contains the correct class name and Java method signature.
- `LongestSubstringWithAtMostTwoDistinctCharactersTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LongestSubstringWithAtMostTwoDistinctCharacters.java` - blank Java starter solution
- `LongestSubstringWithAtMostTwoDistinctCharactersTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
