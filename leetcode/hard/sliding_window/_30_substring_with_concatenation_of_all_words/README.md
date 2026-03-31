# 30. Substring with Concatenation of All Words

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Strings
- Folder Path: `leetcode/hard/sliding_window/30_substring_with_concatenation_of_all_words`
- Folder Name: `30_substring_with_concatenation_of_all_words`
- Official Link: https://leetcode.com/problems/substring-with-concatenation-of-all-words/

## Problem Overview
You are given a string s and an array of strings words . All the strings of words are of the same length .
A concatenated string is a string that exactly contains all the strings of any permutation of words concatenated.

## Java Starter Signature
```java
public List<Integer> findSubstring(String s, String[] words)
```

## Suggested Test Cases
1. `s = "barfoothefoobarman", words = ["foo","bar"]` -> `[0,9]`
2. `s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]` -> `[]`
3. `s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]` -> `[6,9,12]`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SubstringWithConcatenationOfAllWords.java` contains the correct class name and Java method signature.
- `SubstringWithConcatenationOfAllWordsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SubstringWithConcatenationOfAllWords.java` - blank Java starter solution
- `SubstringWithConcatenationOfAllWordsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
