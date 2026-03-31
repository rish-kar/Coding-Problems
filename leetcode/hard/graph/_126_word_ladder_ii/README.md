# 126. Word Ladder II

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Strings
- Folder Path: `leetcode/hard/graph/126_word_ladder_ii`
- Folder Name: `126_word_ladder_ii`
- Official Link: https://leetcode.com/problems/word-ladder-ii/

## Problem Overview
A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words beginWord -> s 1 -> s 2 -> ... -> s k such that
You are given two words, beginWord and endWord , and a dictionary wordList , return all the shortest transformation sequences from beginWord to endWord , or an empty list if no such sequence exists. Each sequence should be returned as a list of the words [beginWord, s 1 , s 2 , ..., s k ] .

## Java Starter Signature
```java
public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList)
```

## Suggested Test Cases
1. `beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]` -> `[["hit","hot","dot","dog","cog"],["hit","hot","lot","log","cog"]]`
2. `beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]` -> `[]`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `WordLadderII.java` contains the correct class name and Java method signature.
- `WordLadderIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `WordLadderII.java` - blank Java starter solution
- `WordLadderIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
