# 158. Read N Characters Given read4 II - Call Multiple Times

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/arrays/158_read_n_characters_given_read4_ii_call_multiple_times`
- Folder Name: `158_read_n_characters_given_read4_ii_call_multiple_times`
- Official Link: https://leetcode.com/problems/read-n-characters-given-read4-ii-call-multiple-times/

## Problem Overview
Implement the core logic for Read N Characters Given read4 II - Call Multiple Times exactly as the prompt defines.
Work through the array based on the problem rule and compute the requested value.

## Java Starter Signature
```java
public List<String> read(String file, Object queries)
```

## Suggested Test Cases
1. `second official example` -> `same expected output as the example`
2. `s = ""` -> `""`
3. `s = "abc"` -> `"abc"`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ReadNCharactersGivenReadFourIICallMultipleTimes.java` contains the correct class name and Java method signature.
- `ReadNCharactersGivenReadFourIICallMultipleTimesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ReadNCharactersGivenReadFourIICallMultipleTimes.java` - blank Java starter solution
- `ReadNCharactersGivenReadFourIICallMultipleTimesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
