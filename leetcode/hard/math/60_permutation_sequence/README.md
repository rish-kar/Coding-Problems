# 60. Permutation Sequence

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Math
- Folder Path: `leetcode/hard/math/60_permutation_sequence`
- Folder Name: `60_permutation_sequence`
- Official Link: https://leetcode.com/problems/permutation-sequence/

## Problem Overview
Return the kth permutation sequence of the numbers 1 through n.

## Java Starter Signature
```java
public String getPermutation(int n, int k)
```


## Suggested Test Cases
1. `n = 3, k = 3 -> "213"`
2. `n = 4, k = 9 -> "2314"`
3. `n = 3, k = 1 -> "123"`

## What To Watch For
- Check overflow boundaries before returning the result.
- Negative values and zero often need separate reasoning from the main positive case.
- Look for repeated structure that can be reduced with arithmetic instead of brute force.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PermutationSequence.java` contains the correct class name and Java method signature.
- `PermutationSequenceTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PermutationSequence.java` - blank Java starter solution
- `PermutationSequenceTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
