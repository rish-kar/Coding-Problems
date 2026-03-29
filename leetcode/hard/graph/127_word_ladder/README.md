# 127. Word Ladder

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Strings
- Folder Path: `leetcode/hard/graph/127_word_ladder`
- Folder Name: `127_word_ladder`
- Official Link: https://leetcode.com/problems/word-ladder/

## Problem Overview
A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words beginWord -> s 1 -> s 2 -> ... -> s k such that
You are given two words, beginWord and endWord , and a dictionary wordList , return the number of words in the shortest transformation sequence from beginWord to endWord , or 0 if no such sequence exists.

## Java Starter Signature
```java
public int ladderLength(String beginWord, String endWord, List<String> wordList)
```

## Suggested Test Cases
1. `beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]` -> `5`
2. `beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]` -> `0`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `WordLadder.java` contains the correct class name and Java method signature.
- `WordLadderTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `WordLadder.java` - blank Java starter solution
- `WordLadderTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
