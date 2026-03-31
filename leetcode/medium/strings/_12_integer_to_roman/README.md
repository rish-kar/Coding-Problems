# 12. Integer to Roman

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/strings/12_integer_to_roman`
- Folder Name: `12_integer_to_roman`
- Official Link: https://leetcode.com/problems/integer-to-roman/

## Problem Overview
Seven different symbols represent Roman numerals with the following values
Roman numerals are formed by appending the conversions of decimal place values from highest to lowest. Converting a decimal place value into a Roman numeral has the following rules

## Java Starter Signature
```java
public String intToRoman(int num)
```

## Suggested Test Cases
1. `num = 3749` -> `"MMMDCCXLIX"`
2. `num = 58` -> `"LVIII"`
3. `num = 1994` -> `"MCMXCIV"`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `IntegerToRoman.java` contains the correct class name and Java method signature.
- `IntegerToRomanTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `IntegerToRoman.java` - blank Java starter solution
- `IntegerToRomanTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
