# 38. Count and Say

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/strings/38_count_and_say`
- Folder Name: `38_count_and_say`
- Official Link: https://leetcode.com/problems/count-and-say/

## Problem Overview
The count-and-say sequence is a sequence of digit strings defined by the recursive formula
Run-length encoding (RLE) is a string compression method that works by replacing consecutive identical characters (repeated 2 or more times) with the concatenation of the character and the number marking the count of the characters (length of the run). For example, to compress the string "3322251" we replace "33" with "23" , replace "222" with "32" , replace "5" with "15" and replace "1" with "11" . Thus the compressed string becomes "23321511" .

## Java Starter Signature
```java
public String countAndSay(int n)
```

## Suggested Test Cases
1. `n = 4` -> `"1211"`
2. `n = 1` -> `"1"`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `CountAndSay.java` contains the correct class name and Java method signature.
- `CountAndSayTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `CountAndSay.java` - blank Java starter solution
- `CountAndSayTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
