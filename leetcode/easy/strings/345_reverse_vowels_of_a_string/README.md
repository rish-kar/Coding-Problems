# 345. Reverse Vowels of a String

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Strings
- Folder Path: `leetcode/easy/strings/345_reverse_vowels_of_a_string`
- Folder Name: `345_reverse_vowels_of_a_string`
- Official Link: https://leetcode.com/problems/reverse-vowels-of-a-string/

## Problem Overview
You are given a string s , reverse only all the vowels in the string and return it.
The vowels are 'a' , 'e' , 'i' , 'o' , and 'u' , and they can appear in both lower and upper cases, more than once.

## Java Starter Signature
```java
public String reverseVowels(String s)
```

## Suggested Test Cases
1. `s = "IceCreAm"` -> `"AceCreIm"`
2. `s = "leetcode"` -> `"leotcede"`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ReverseVowelsOfAString.java` contains the correct class name and Java method signature.
- `ReverseVowelsOfAStringTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ReverseVowelsOfAString.java` - blank Java starter solution
- `ReverseVowelsOfAStringTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
