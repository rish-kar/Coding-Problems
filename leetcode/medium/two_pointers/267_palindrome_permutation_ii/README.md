# 267. Palindrome Permutation II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/two_pointers/267_palindrome_permutation_ii`
- Folder Name: `267_palindrome_permutation_ii`
- Official Link: https://leetcode.com/problems/palindrome-permutation-ii/

## Problem Overview
Implement the core logic for Palindrome Permutation II exactly as the prompt defines.
Process the string input according to the matching or transformation rule in the prompt.

## Java Starter Signature
```java
public List<String> generatePalindromes(String s)
```

## Suggested Test Cases
1. `second official example` -> `same expected output as the example`
2. `s = ""` -> `""`
3. `s = "abc"` -> `"abc"`

## What To Watch For
- Handle odd and even length cases correctly when comparing mirrored characters.
- Normalize or skip non-relevant characters only if the problem statement requires it.
- Stop early once a mismatch proves the answer cannot be valid.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PalindromePermutationII.java` contains the correct class name and Java method signature.
- `PalindromePermutationIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PalindromePermutationII.java` - blank Java starter solution
- `PalindromePermutationIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
