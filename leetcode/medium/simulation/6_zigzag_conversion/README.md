# 6. Zigzag Conversion

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/simulation/6_zigzag_conversion`
- Folder Name: `6_zigzag_conversion`
- Official Link: https://leetcode.com/problems/zigzag-conversion/

## Problem Overview
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
And then read line by line: "PAHNAPLSIIGYIR"

## Java Starter Signature
```java
public String convert(String s, int numRows)
```

## Suggested Test Cases
1. `s = "PAYPALISHIRING", numRows = 3` -> `"PAHNAPLSIIGYIR"`
2. `s = "PAYPALISHIRING", numRows = 4` -> `"PINALSIGYAHRPI"`
3. `s = "A", numRows = 1` -> `"A"`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ZigzagConversion.java` contains the correct class name and Java method signature.
- `ZigzagConversionTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ZigzagConversion.java` - blank Java starter solution
- `ZigzagConversionTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
