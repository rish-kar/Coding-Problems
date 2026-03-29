# 273. Integer to English Words

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Strings
- Folder Path: `leetcode/hard/strings/273_integer_to_english_words`
- Folder Name: `273_integer_to_english_words`
- Official Link: https://leetcode.com/problems/integer-to-english-words/

## Problem Overview
Convert a non-negative integer num to its English words representation.
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public String numberToWords(int num)
```

## Suggested Test Cases
1. `num = 123` -> `"One Hundred Twenty Three"`
2. `num = 12345` -> `"Twelve Thousand Three Hundred Forty Five"`
3. `num = 1234567` -> `"One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `IntegerToEnglishWords.java` contains the correct class name and Java method signature.
- `IntegerToEnglishWordsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `IntegerToEnglishWords.java` - blank Java starter solution
- `IntegerToEnglishWordsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
