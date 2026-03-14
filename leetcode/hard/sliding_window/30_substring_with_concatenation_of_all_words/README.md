# 30. Substring with Concatenation of All Words

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Sliding Window
- Folder Path: `leetcode/hard/sliding_window/30_substring_with_concatenation_of_all_words`
- Folder Name: `30_substring_with_concatenation_of_all_words`
- Official Link: https://leetcode.com/problems/substring-with-concatenation-of-all-words/

## Problem Overview
Return every starting index where a substring is formed by concatenating all words exactly once and without extra characters.

## Java Starter Signature
```java
public List<Integer> findSubstring(String s, String[] words)
```


## Suggested Test Cases
1. `s = "barfoothefoobarman", words = ["foo","bar"] -> [0,9]`
2. `s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"] -> []`
3. `s = "barfoofoobarthefoobarman", words = ["bar","foo","the"] -> [6,9,12]`

## What To Watch For
- Update the window state in the same order every time you expand or shrink.
- Character counts or last-seen positions usually matter more than the raw substring itself.
- Remember to compare answers after the final shrink or expansion step too.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SubstringWithConcatenationOfAllWords.java` contains the correct class name and Java method signature.
- `SubstringWithConcatenationOfAllWordsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SubstringWithConcatenationOfAllWords.java` - blank Java starter solution
- `SubstringWithConcatenationOfAllWordsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
