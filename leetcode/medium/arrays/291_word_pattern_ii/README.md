# 291. Word Pattern II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/arrays/291_word_pattern_ii`
- Folder Name: `291_word_pattern_ii`
- Official Link: https://leetcode.com/problems/word-pattern-ii/

## Problem Overview
Implement the core logic for Word Pattern II exactly as the prompt defines.
Process the string input according to the matching or transformation rule in the prompt.

## Java Starter Signature
```java
public boolean wordPatternMatch(String pattern, String s)
```

## Suggested Test Cases
1. `second official example` -> `same expected output as the example`
2. `s = "", t = ""` -> `true`
3. `s = "a", t = ""` -> `false`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `WordPatternII.java` contains the correct class name and Java method signature.
- `WordPatternIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `WordPatternII.java` - blank Java starter solution
- `WordPatternIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
