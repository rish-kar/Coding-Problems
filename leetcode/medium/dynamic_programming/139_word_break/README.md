# 139. Word Break

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/dynamic_programming/139_word_break`
- Folder Name: `139_word_break`
- Official Link: https://leetcode.com/problems/word-break/

## Problem Overview
You are given a string s and a dictionary of strings wordDict , return true if s can be segmented into a space-separated sequence of one or more dictionary words.
Note that the same word in the dictionary may be reused multiple times in the segmentation.

## Java Starter Signature
```java
public boolean wordBreak(String s, List<String> wordDict)
```

## Suggested Test Cases
1. `s = "leetcode", wordDict = ["leet","code"]` -> `true`
2. `s = "applepenapple", wordDict = ["apple","pen"]` -> `true`
3. `s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]` -> `false`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `WordBreak.java` contains the correct class name and Java method signature.
- `WordBreakTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `WordBreak.java` - blank Java starter solution
- `WordBreakTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
