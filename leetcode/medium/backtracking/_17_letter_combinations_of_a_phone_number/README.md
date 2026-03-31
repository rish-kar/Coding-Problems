# 17. Letter Combinations of a Phone Number

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/backtracking/17_letter_combinations_of_a_phone_number`
- Folder Name: `17_letter_combinations_of_a_phone_number`
- Official Link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/

## Problem Overview
You are given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Then return the answer in any order .
A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

## Java Starter Signature
```java
public List<String> letterCombinations(String digits)
```

## Suggested Test Cases
1. `digits = "23"` -> `["ad","ae","af","bd","be","bf","cd","ce","cf"]`
2. `digits = "2"` -> `["a","b","c"]`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LetterCombinationsOfAPhoneNumber.java` contains the correct class name and Java method signature.
- `LetterCombinationsOfAPhoneNumberTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LetterCombinationsOfAPhoneNumber.java` - blank Java starter solution
- `LetterCombinationsOfAPhoneNumberTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
