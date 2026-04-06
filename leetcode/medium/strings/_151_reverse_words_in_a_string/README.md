# 151. Reverse Words in a String

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/strings/151_reverse_words_in_a_string`
- Folder Name: `151_reverse_words_in_a_string`
- Official Link: https://leetcode.com/problems/reverse-words-in-a-string/

## Problem Overview
You are given an input string s , reverse the order of the words .
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

## Java Starter Signature
```java
public String reverseWords(String s)
```

## Suggested Test Cases
1. `s = "the sky is blue"` -> `"blue is sky the"`
2. `s = " hello world "` -> `"world hello"`
3. `s = "a good example"` -> `"example good a"`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ReverseWordsInAString.java` contains the correct class name and Java method signature.
- `ReverseWordsInAStringTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ReverseWordsInAString.java` - blank Java starter solution
- `ReverseWordsInAStringTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
