# 392. Is Subsequence

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Strings
- Folder Path: `leetcode/easy/arrays/392_is_subsequence`
- Folder Name: `392_is_subsequence`
- Official Link: https://leetcode.com/problems/is-subsequence/

## Problem Overview
Check whether string `s` can be formed by deleting some characters from `t` while keeping the remaining characters in order.
Return `true` when `s` appears as a subsequence of `t`; otherwise return `false`.

## Java Starter Signature
```java
public boolean isSubsequence(String s, String t)
```

## Suggested Test Cases
1. `s = "abc", t = "ahbgdc"` -> `true`
2. `s = "axc", t = "ahbgdc"` -> `false`
3. `s = "", t = "ahbgdc"` -> `true`

## What To Watch For
- An empty string `s` is always a subsequence of any `t`.
- Advance through `t` fully, but move the pointer in `s` only when characters match.
- Do not confuse subsequence with substring; matched characters do not need to be adjacent.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `IsSubsequence.java` contains the correct class name and Java method signature.
- `IsSubsequenceTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `IsSubsequence.java` - blank Java starter solution
- `IsSubsequenceTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
