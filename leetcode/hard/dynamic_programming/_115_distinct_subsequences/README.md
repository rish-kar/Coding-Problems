# 115. Distinct Subsequences

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Strings
- Folder Path: `leetcode/hard/dynamic_programming/115_distinct_subsequences`
- Folder Name: `115_distinct_subsequences`
- Official Link: https://leetcode.com/problems/distinct-subsequences/

## Problem Overview
Check whether string `s` can be formed by deleting some characters from `t` while keeping the remaining characters in order.
Return `true` when `s` appears as a subsequence of `t`; otherwise return `false`.

## Java Starter Signature
```java
public int numDistinct(String s, String t)
```

## Suggested Test Cases
1. `s = "rabbbit", t = "rabbit"` -> `3`
2. `s = "babgbag", t = "bag"` -> `5`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- An empty string `s` is always a subsequence of any `t`.
- Advance through `t` fully, but move the pointer in `s` only when characters match.
- Do not confuse subsequence with substring; matched characters do not need to be adjacent.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `DistinctSubsequences.java` contains the correct class name and Java method signature.
- `DistinctSubsequencesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `DistinctSubsequences.java` - blank Java starter solution
- `DistinctSubsequencesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
