# 385. Mini Parser

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/arrays/385_mini_parser`
- Folder Name: `385_mini_parser`
- Official Link: https://leetcode.com/problems/mini-parser/

## Problem Overview
You are given a string s represents the serialization of a nested list, implement a parser to deserialize it and return the deserialized NestedInteger .
Each element is either an integer or a list whose elements may also be integers or other lists.

## Java Starter Signature
```java
public NestedInteger deserialize(String s)
```

## Suggested Test Cases
1. `s = "324"` -> `324`
2. `s = "[123,[456,[789]]]"` -> `[123,[456,[789]]]`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MiniParser.java` contains the correct class name and Java method signature.
- `MiniParserTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MiniParser.java` - blank Java starter solution
- `MiniParserTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
