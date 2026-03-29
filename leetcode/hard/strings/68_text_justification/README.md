# 68. Text Justification

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Strings
- Folder Path: `leetcode/hard/strings/68_text_justification`
- Folder Name: `68_text_justification`
- Official Link: https://leetcode.com/problems/text-justification/

## Problem Overview
You are given an array of strings words and a width maxWidth , format the text such that each line has exactly maxWidth characters and is fully (left and right) justified.
You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces ' ' when necessary so that each line has exactly maxWidth characters.

## Java Starter Signature
```java
public List<String> fullJustify(String[] words, int maxWidth)
```

## Suggested Test Cases
1. `words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16` -> `[ "This is an", "example of text", "justification. " ]`
2. `words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16` -> `[ "What must be", "acknowledgment ", "shall be " ]`
3. `words = ["Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"], maxWidth = 20` -> `[ "Science is what we", "understand well", "enough to explain to", "a computer. Art is", "everything else we", "do " ]`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `TextJustification.java` contains the correct class name and Java method signature.
- `TextJustificationTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `TextJustification.java` - blank Java starter solution
- `TextJustificationTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
