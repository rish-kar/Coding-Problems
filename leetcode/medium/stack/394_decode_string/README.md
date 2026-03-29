# 394. Decode String

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/stack/394_decode_string`
- Folder Name: `394_decode_string`
- Official Link: https://leetcode.com/problems/decode-string/

## Problem Overview
You are given an encoded string, return its decoded string.
The encoding rule is: k[encoded_string] , where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

## Java Starter Signature
```java
public String decodeString(String s)
```

## Suggested Test Cases
1. `s = "3[a]2[bc]"` -> `"aaabcbc"`
2. `s = "3[a2[c]]"` -> `"accaccacc"`
3. `s = "2[abc]3[cd]ef"` -> `"abcabccdcdcdef"`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `DecodeString.java` contains the correct class name and Java method signature.
- `DecodeStringTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `DecodeString.java` - blank Java starter solution
- `DecodeStringTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
