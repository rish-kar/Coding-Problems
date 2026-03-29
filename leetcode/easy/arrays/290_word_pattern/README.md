# 290. Word Pattern

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Strings
- Folder Path: `leetcode/easy/arrays/290_word_pattern`
- Folder Name: `290_word_pattern`
- Official Link: https://leetcode.com/problems/word-pattern/

## Problem Overview
You are given a pattern and a string s , find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s . Specifically

## Java Starter Signature
```java
public boolean wordPattern(String pattern, String s)
```

## Suggested Test Cases
1. `pattern = "abba", s = "dog cat cat dog"` -> `true`
2. `pattern = "abba", s = "dog cat cat fish"` -> `false`
3. `pattern = "aaaa", s = "dog cat cat dog"` -> `false`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `WordPattern.java` contains the correct class name and Java method signature.
- `WordPatternTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `WordPattern.java` - blank Java starter solution
- `WordPatternTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
