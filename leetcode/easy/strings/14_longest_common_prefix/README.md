# 14. Longest Common Prefix

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Strings
- Folder Path: `leetcode/easy/strings/14_longest_common_prefix`
- Folder Name: `14_longest_common_prefix`
- Official Link: https://leetcode.com/problems/longest-common-prefix/

## Problem Overview
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "" .

## Java Starter Signature
```java
public String longestCommonPrefix(String[] strs)
```

## Suggested Test Cases
1. `strs = ["flower","flow","flight"]` -> `"fl"`
2. `strs = ["dog","racecar","car"]` -> `""`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LongestCommonPrefix.java` contains the correct class name and Java method signature.
- `LongestCommonPrefixTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LongestCommonPrefix.java` - blank Java starter solution
- `LongestCommonPrefixTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
