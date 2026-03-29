# 269. Alien Dictionary

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Strings
- Folder Path: `leetcode/hard/graph/269_alien_dictionary`
- Folder Name: `269_alien_dictionary`
- Official Link: https://leetcode.com/problems/alien-dictionary/

## Problem Overview
Implement the core logic for Alien Dictionary exactly as the prompt defines.
Process the string input according to the matching or transformation rule in the prompt.

## Java Starter Signature
```java
public String alienOrder(List<String> words)
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

- `AlienDictionary.java` contains the correct class name and Java method signature.
- `AlienDictionaryTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `AlienDictionary.java` - blank Java starter solution
- `AlienDictionaryTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
