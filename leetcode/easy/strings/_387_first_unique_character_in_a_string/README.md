# 387. First Unique Character in a String

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Strings
- Folder Path: `leetcode/easy/strings/387_first_unique_character_in_a_string`
- Folder Name: `387_first_unique_character_in_a_string`
- Official Link: https://leetcode.com/problems/first-unique-character-in-a-string/

## Problem Overview
You are given a string s , find the first non-repeating character in it and return its index. If it does not exist, return -1 .
The character 'l' at index 0 is the first character that does not occur at any other index.

## Java Starter Signature
```java
public int firstUniqChar(String s)
```

## Suggested Test Cases
1. `s = "leetcode"` -> `0`
2. `s = "loveleetcode"` -> `2`
3. `s = "aabb"` -> `-1`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `FirstUniqueCharacterInAString.java` contains the correct class name and Java method signature.
- `FirstUniqueCharacterInAStringTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `FirstUniqueCharacterInAString.java` - blank Java starter solution
- `FirstUniqueCharacterInAStringTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
