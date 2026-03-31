# 340. Longest Substring with At Most K Distinct Characters

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/binary_search_tree/340_longest_substring_with_at_most_k_distinct_characters`
- Folder Name: `340_longest_substring_with_at_most_k_distinct_characters`
- Official Link: https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/

## Problem Overview
Implement the core logic for Longest Substring with At Most K Distinct Characters exactly as the prompt defines.
Process the string input according to the matching or transformation rule in the prompt.

## Java Starter Signature
```java
public int lengthOfLongestSubstringKDistinct(String s, int k)
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

- `LongestSubstringWithAtMostKDistinctCharacters.java` contains the correct class name and Java method signature.
- `LongestSubstringWithAtMostKDistinctCharactersTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LongestSubstringWithAtMostKDistinctCharacters.java` - blank Java starter solution
- `LongestSubstringWithAtMostKDistinctCharactersTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
