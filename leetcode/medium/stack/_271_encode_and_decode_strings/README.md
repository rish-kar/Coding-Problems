# 271. Encode and Decode Strings

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/stack/271_encode_and_decode_strings`
- Folder Name: `271_encode_and_decode_strings`
- Official Link: https://leetcode.com/problems/encode-and-decode-strings/

## Problem Overview
Implement the core logic for Encode and Decode Strings exactly as the prompt defines.
Process the string input according to the matching or transformation rule in the prompt.

## Java Starter Signature
```java
public List<String> encode(List<String> dummy_input)
```

## Suggested Test Cases
1. `strs = ["lint", "code", "love", "you"]` -> `["lint", "code", "love", "you"]`
2. `strs = ["lint", "code", "love", "you"]` -> `decode(encode(strs)) = ["lint", "code", "love", "you"]`
3. `strs = ["", "abc", "de"]` -> `decode(encode(strs)) = ["", "abc", "de"]`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `EncodeAndDecodeStrings.java` contains the correct class name and Java method signature.
- `EncodeAndDecodeStringsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `EncodeAndDecodeStrings.java` - blank Java starter solution
- `EncodeAndDecodeStringsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
