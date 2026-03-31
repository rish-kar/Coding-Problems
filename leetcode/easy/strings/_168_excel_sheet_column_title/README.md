# 168. Excel Sheet Column Title

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Strings
- Folder Path: `leetcode/easy/strings/168_excel_sheet_column_title`
- Folder Name: `168_excel_sheet_column_title`
- Official Link: https://leetcode.com/problems/excel-sheet-column-title/

## Problem Overview
You are given an integer columnNumber , return its corresponding column title as it appears in an Excel sheet .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public String convertToTitle(int columnNumber)
```

## Suggested Test Cases
1. `columnNumber = 1` -> `"A"`
2. `columnNumber = 28` -> `"AB"`
3. `columnNumber = 701` -> `"ZY"`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ExcelSheetColumnTitle.java` contains the correct class name and Java method signature.
- `ExcelSheetColumnTitleTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ExcelSheetColumnTitle.java` - blank Java starter solution
- `ExcelSheetColumnTitleTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
