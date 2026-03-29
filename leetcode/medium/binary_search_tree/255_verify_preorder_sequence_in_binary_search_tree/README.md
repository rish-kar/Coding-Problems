# 255. Verify Preorder Sequence in Binary Search Tree

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/binary_search_tree/255_verify_preorder_sequence_in_binary_search_tree`
- Folder Name: `255_verify_preorder_sequence_in_binary_search_tree`
- Official Link: https://leetcode.com/problems/verify-preorder-sequence-in-binary-search-tree/

## Problem Overview
Implement the core logic for Verify Preorder Sequence in Binary Search Tree exactly as the prompt defines.
Work through the array based on the problem rule and compute the requested value.

## Java Starter Signature
```java
public boolean verifyPreorder(Object preorder)
```

## Suggested Test Cases
1. `input = []` -> `true`
2. `input = [1]` -> `false`
3. `input = [1,2,3]` -> `true`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `VerifyPreorderSequenceInBinarySearchTree.java` contains the correct class name and Java method signature.
- `VerifyPreorderSequenceInBinarySearchTreeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `VerifyPreorderSequenceInBinarySearchTree.java` - blank Java starter solution
- `VerifyPreorderSequenceInBinarySearchTreeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
