# 14. Longest Common Prefix

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Strings
- Folder Path: `leetcode/easy/strings/14_longest_common_prefix`
- Folder Name: `14_longest_common_prefix`
- Official Link: https://leetcode.com/problems/longest-common-prefix/

## Problem Overview
Return the longest prefix shared by every string in the array.

## Java Starter Signature
```java
public String longestCommonPrefix(String[] strs)
```


## Suggested Test Cases
1. `strs = ["flower","flow","flight"] -> "fl"`
2. `strs = ["dog","racecar","car"] -> ""`
3. `strs = ["interspecies","interstellar","interstate"] -> "inters"`

## What To Watch For
- Pay close attention to spaces, punctuation, repeated characters, and empty-string behavior.
- Parsing problems usually have a strict order of operations, so handle sign and invalid input carefully.
- When building a result string, think about whether repeated concatenation should be avoided.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LongestCommonPrefix.java` contains the correct class name and Java method signature.
- `LongestCommonPrefixTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LongestCommonPrefix.java` - blank Java starter solution
- `LongestCommonPrefixTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
