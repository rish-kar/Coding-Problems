# 187. Repeated DNA Sequences

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/arrays/187_repeated_dna_sequences`
- Folder Name: `187_repeated_dna_sequences`
- Official Link: https://leetcode.com/problems/repeated-dna-sequences/

## Problem Overview
The DNA sequence is composed of a series of nucleotides abbreviated as 'A' , 'C' , 'G' , and 'T' .
When studying DNA , it is useful to identify repeated sequences within the DNA.

## Java Starter Signature
```java
public List<String> findRepeatedDnaSequences(String s)
```

## Suggested Test Cases
1. `s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"` -> `["AAAAACCCCC","CCCCCAAAAA"]`
2. `s = "AAAAAAAAAAAAA"` -> `["AAAAAAAAAA"]`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RepeatedDNASequences.java` contains the correct class name and Java method signature.
- `RepeatedDNASequencesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RepeatedDNASequences.java` - blank Java starter solution
- `RepeatedDNASequencesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
