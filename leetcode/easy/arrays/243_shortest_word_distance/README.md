# 243. Shortest Word Distance

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Strings
- Folder Path: `leetcode/easy/arrays/243_shortest_word_distance`
- Folder Name: `243_shortest_word_distance`
- Official Link: https://leetcode.com/problems/shortest-word-distance/

## Problem Overview
Implement the core logic for Shortest Word Distance exactly as the prompt defines.
Process the string input according to the matching or transformation rule in the prompt.

## Java Starter Signature
```java
public int shortestDistance(List<String> wordsDict, String word1, String word2)
```

## Suggested Test Cases
1. `s = ""` -> `""`
2. `s = "abc"` -> `"abc"`
3. `s = "aab"` -> `"aab"`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ShortestWordDistance.java` contains the correct class name and Java method signature.
- `ShortestWordDistanceTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ShortestWordDistance.java` - blank Java starter solution
- `ShortestWordDistanceTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
