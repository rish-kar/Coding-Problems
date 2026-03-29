# 58. Length of Last Word

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Strings
- Folder Path: `leetcode/easy/strings/58_length_of_last_word`
- Folder Name: `58_length_of_last_word`
- Official Link: https://leetcode.com/problems/length-of-last-word/

## Problem Overview
You are given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

## Java Starter Signature
```java
public int lengthOfLastWord(String s)
```

## Suggested Test Cases
1. `s = "Hello World"` -> `5`
2. `s = " fly me to the moon "` -> `4`
3. `s = "luffy is still joyboy"` -> `6`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LengthOfLastWord.java` contains the correct class name and Java method signature.
- `LengthOfLastWordTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LengthOfLastWord.java` - blank Java starter solution
- `LengthOfLastWordTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
