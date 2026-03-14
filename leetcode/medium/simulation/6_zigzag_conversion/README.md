# 6. Zigzag Conversion

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Simulation
- Folder Path: `leetcode/medium/simulation/6_zigzag_conversion`
- Folder Name: `6_zigzag_conversion`
- Official Link: https://leetcode.com/problems/zigzag-conversion/

## Problem Overview
Write the string in a zigzag pattern across the given number of rows and then read it row by row.

## Java Starter Signature
```java
public String convert(String s, int numRows)
```


## Suggested Test Cases
1. `s = "PAYPALISHIRING", numRows = 3 -> "PAHNAPLSIIGYIR"`
2. `s = "PAYPALISHIRING", numRows = 4 -> "PINALSIGYAHRPI"`
3. `s = "A", numRows = 1 -> "A"`

## What To Watch For
- Write down the movement pattern or state transitions before coding them.
- Special cases like a single row or single column can bypass the normal flow.
- The index update order matters whenever direction changes happen.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ZigzagConversion.java` contains the correct class name and Java method signature.
- `ZigzagConversionTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ZigzagConversion.java` - blank Java starter solution
- `ZigzagConversionTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
