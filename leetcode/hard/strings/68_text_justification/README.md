# 68. Text Justification

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Strings
- Folder Path: `leetcode/hard/strings/68_text_justification`
- Folder Name: `68_text_justification`
- Official Link: https://leetcode.com/problems/text-justification/

## Problem Overview
Pack the words into fully justified lines of exactly maxWidth characters.

## Java Starter Signature
```java
public List<String> fullJustify(String[] words, int maxWidth)
```


## Suggested Test Cases
1. `words = ["This","is","an","example","of","text","justification."], maxWidth = 16 -> justified lines`
2. `the last line should be left-justified`
3. `lines with one word must pad spaces on the right`

## What To Watch For
- Pay close attention to spaces, punctuation, repeated characters, and empty-string behavior.
- Parsing problems usually have a strict order of operations, so handle sign and invalid input carefully.
- When building a result string, think about whether repeated concatenation should be avoided.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `TextJustification.java` contains the correct class name and Java method signature.
- `TextJustificationTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `TextJustification.java` - blank Java starter solution
- `TextJustificationTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
