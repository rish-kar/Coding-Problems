# 140. Word Break II

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Strings
- Folder Path: `leetcode/hard/dynamic_programming/140_word_break_ii`
- Folder Name: `140_word_break_ii`
- Official Link: https://leetcode.com/problems/word-break-ii/

## Problem Overview
You are given a string s and a dictionary of strings wordDict , add spaces in s to construct a sentence where each word is a valid dictionary word. Then return all such possible sentences in any order .
Note that the same word in the dictionary may be reused multiple times in the segmentation.

## Java Starter Signature
```java
public List<String> wordBreak(String s, List<String> wordDict)
```

## Suggested Test Cases
1. `s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]` -> `["cats and dog","cat sand dog"]`
2. `s = "pineapplepenapple", wordDict = ["apple","pen","applepen","pine","pineapple"]` -> `["pine apple pen apple","pineapple pen apple","pine applepen apple"]`
3. `s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]` -> `[]`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `WordBreakII.java` contains the correct class name and Java method signature.
- `WordBreakIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `WordBreakII.java` - blank Java starter solution
- `WordBreakIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
