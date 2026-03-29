# 49. Group Anagrams

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/hash_map/49_group_anagrams`
- Folder Name: `49_group_anagrams`
- Official Link: https://leetcode.com/problems/group-anagrams/

## Problem Overview
You are given an array of strings strs , group the anagrams together. You can return the answer in any order .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public List<List<String>> groupAnagrams(String[] strs)
```

## Suggested Test Cases
1. `strs = ["eat","tea","tan","ate","nat","bat"]` -> `[["bat"],["nat","tan"],["ate","eat","tea"]]`
2. `strs = [""]` -> `[[""]]`
3. `strs = ["a"]` -> `[["a"]]`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `GroupAnagrams.java` contains the correct class name and Java method signature.
- `GroupAnagramsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `GroupAnagrams.java` - blank Java starter solution
- `GroupAnagramsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
