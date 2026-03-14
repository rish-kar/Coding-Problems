# 17. Letter Combinations of a Phone Number

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Backtracking
- Folder Path: `leetcode/medium/backtracking/17_letter_combinations_of_a_phone_number`
- Folder Name: `17_letter_combinations_of_a_phone_number`
- Official Link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/

## Problem Overview
Return every letter combination that the digit string could represent on a phone keypad.

## Java Starter Signature
```java
public List<String> letterCombinations(String digits)
```


## Suggested Test Cases
1. `digits = "23" -> ["ad","ae","af","bd","be","bf","cd","ce","cf"]`
2. `digits = "" -> []`
3. `digits = "2" -> ["a","b","c"]`

## What To Watch For
- Define the stopping condition first so you know exactly when to record an answer.
- Undo each choice after the recursive call so the next branch starts cleanly.
- If duplicates are possible, decide where to prune them before recursion explodes.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LetterCombinationsOfAPhoneNumber.java` contains the correct class name and Java method signature.
- `LetterCombinationsOfAPhoneNumberTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LetterCombinationsOfAPhoneNumber.java` - blank Java starter solution
- `LetterCombinationsOfAPhoneNumberTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
