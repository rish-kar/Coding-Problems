# 242. Valid Anagram

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Strings
- Folder Path: `leetcode/easy/strings/242_valid_anagram`
- Folder Name: `242_valid_anagram`
- Official Link: https://leetcode.com/problems/valid-anagram/

## Problem Overview
You are given two strings s and t , return true if t is an anagram of s , and false otherwise.
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public boolean isAnagram(String s, String t)
```

## Suggested Test Cases
1. `s = "anagram", t = "nagaram"` -> `true`
2. `s = "rat", t = "car"` -> `false`
3. `s = "", t = "ahbgdc"` -> `true`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ValidAnagram.java` contains the correct class name and Java method signature.
- `ValidAnagramTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ValidAnagram.java` - blank Java starter solution
- `ValidAnagramTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
