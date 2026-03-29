# 28. Find the Index of the First Occurrence in a String

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Strings
- Folder Path: `leetcode/easy/strings/28_find_the_index_of_the_first_occurrence_in_a_string`
- Folder Name: `28_find_the_index_of_the_first_occurrence_in_a_string`
- Official Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

## Problem Overview
You are given two strings needle and haystack , return the index of the first occurrence of needle in haystack , or -1 if needle is not part of haystack .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int strStr(String haystack, String needle)
```

## Suggested Test Cases
1. `haystack = "sadbutsad", needle = "sad"` -> `0`
2. `haystack = "leetcode", needle = "leeto"` -> `-1`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `FindTheIndexOfTheFirstOccurrenceInAString.java` contains the correct class name and Java method signature.
- `FindTheIndexOfTheFirstOccurrenceInAStringTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `FindTheIndexOfTheFirstOccurrenceInAString.java` - blank Java starter solution
- `FindTheIndexOfTheFirstOccurrenceInAStringTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
