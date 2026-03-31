# 320. Generalized Abbreviation

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/arrays/320_generalized_abbreviation`
- Folder Name: `320_generalized_abbreviation`
- Official Link: https://leetcode.com/problems/generalized-abbreviation/

## Problem Overview
Implement the core logic for Generalized Abbreviation exactly as the prompt defines.
Process the string input according to the matching or transformation rule in the prompt.

## Java Starter Signature
```java
public List<String> generateAbbreviations(String word)
```

## Suggested Test Cases
1. `s = ""` -> `""`
2. `s = "abc"` -> `"abc"`
3. `s = "aab"` -> `"aab"`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `GeneralizedAbbreviation.java` contains the correct class name and Java method signature.
- `GeneralizedAbbreviationTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `GeneralizedAbbreviation.java` - blank Java starter solution
- `GeneralizedAbbreviationTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
