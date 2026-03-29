# 246. Strobogrammatic Number

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Strings
- Folder Path: `leetcode/easy/arrays/246_strobogrammatic_number`
- Folder Name: `246_strobogrammatic_number`
- Official Link: https://leetcode.com/problems/strobogrammatic-number/

## Problem Overview
Implement the core logic for Strobogrammatic Number exactly as the prompt defines.
Process the string input according to the matching or transformation rule in the prompt.

## Java Starter Signature
```java
public boolean isStrobogrammatic(String num)
```

## Suggested Test Cases
1. `s = "", t = ""` -> `true`
2. `s = "a", t = ""` -> `false`
3. `s = "abc", t = "abc"` -> `true`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `StrobogrammaticNumber.java` contains the correct class name and Java method signature.
- `StrobogrammaticNumberTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `StrobogrammaticNumber.java` - blank Java starter solution
- `StrobogrammaticNumberTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
