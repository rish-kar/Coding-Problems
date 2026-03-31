# 171. Excel Sheet Column Number

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Strings
- Folder Path: `leetcode/easy/strings/171_excel_sheet_column_number`
- Folder Name: `171_excel_sheet_column_number`
- Official Link: https://leetcode.com/problems/excel-sheet-column-number/

## Problem Overview
You are given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int titleToNumber(String columnTitle)
```

## Suggested Test Cases
1. `columnTitle = "A"` -> `1`
2. `columnTitle = "AB"` -> `28`
3. `columnTitle = "ZY"` -> `701`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ExcelSheetColumnNumber.java` contains the correct class name and Java method signature.
- `ExcelSheetColumnNumberTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ExcelSheetColumnNumber.java` - blank Java starter solution
- `ExcelSheetColumnNumberTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
