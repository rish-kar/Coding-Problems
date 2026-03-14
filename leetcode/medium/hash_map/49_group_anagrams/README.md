# 49. Group Anagrams

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Hash Map
- Folder Path: `leetcode/medium/hash_map/49_group_anagrams`
- Folder Name: `49_group_anagrams`
- Official Link: https://leetcode.com/problems/group-anagrams/

## Problem Overview
Group together the strings that are anagrams of one another.

## Java Starter Signature
```java
public List<List<String>> groupAnagrams(String[] strs)
```


## Suggested Test Cases
1. `strs = ["eat","tea","tan","ate","nat","bat"] -> grouped anagrams`
2. `strs = [""] -> [[""]]`
3. `strs = ["a"] -> [["a"]]`

## What To Watch For
- Make sure repeated values are handled correctly rather than reusing the same index twice.
- Think about whether order matters for the result or only membership/counting does.
- Use a stable key representation when grouping or comparing values.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `GroupAnagrams.java` contains the correct class name and Java method signature.
- `GroupAnagramsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `GroupAnagrams.java` - blank Java starter solution
- `GroupAnagramsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
