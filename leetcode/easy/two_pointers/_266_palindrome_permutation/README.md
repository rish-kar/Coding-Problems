# 266. Palindrome Permutation

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Strings
- Folder Path: `leetcode/easy/two_pointers/266_palindrome_permutation`
- Folder Name: `266_palindrome_permutation`
- Official Link: https://leetcode.com/problems/palindrome-permutation/

## Problem Overview
Implement the core logic for Palindrome Permutation exactly as the prompt defines.
Process the string input according to the matching or transformation rule in the prompt.

## Java Starter Signature
```java
public boolean canPermutePalindrome(String s)
```

## Suggested Test Cases
1. `s = "", t = ""` -> `true`
2. `s = "a", t = ""` -> `false`
3. `s = "abc", t = "abc"` -> `true`

## What To Watch For
- Handle odd and even length cases correctly when comparing mirrored characters.
- Normalize or skip non-relevant characters only if the problem statement requires it.
- Stop early once a mismatch proves the answer cannot be valid.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PalindromePermutation.java` contains the correct class name and Java method signature.
- `PalindromePermutationTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PalindromePermutation.java` - blank Java starter solution
- `PalindromePermutationTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
