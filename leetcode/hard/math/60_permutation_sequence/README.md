# 60. Permutation Sequence

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Math
- Folder Path: `leetcode/hard/math/60_permutation_sequence`
- Folder Name: `60_permutation_sequence`
- Official Link: https://leetcode.com/problems/permutation-sequence/

## Problem Overview
The set [1, 2, 3, ..., n] contains a total of n! unique permutations.
By listing and labeling all of the permutations in order, we get the following sequence for n = 3

## Java Starter Signature
```java
public String getPermutation(int n, int k)
```

## Suggested Test Cases
1. `n = 3, k = 3` -> `"213"`
2. `n = 4, k = 9` -> `"2314"`
3. `n = 3, k = 1` -> `"123"`

## What To Watch For
- Cover edge inputs explicitly so `getPermutation` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PermutationSequence.java` contains the correct class name and Java method signature.
- `PermutationSequenceTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PermutationSequence.java` - blank Java starter solution
- `PermutationSequenceTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
