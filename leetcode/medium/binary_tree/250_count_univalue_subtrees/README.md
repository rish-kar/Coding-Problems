# 250. Count Univalue Subtrees

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Tree
- Folder Path: `leetcode/medium/binary_tree/250_count_univalue_subtrees`
- Folder Name: `250_count_univalue_subtrees`
- Official Link: https://leetcode.com/problems/count-univalue-subtrees/

## Problem Overview
Implement the core logic for Count Univalue Subtrees exactly as the prompt defines.
Traverse the tree with clear base cases and combine child results correctly.

## Java Starter Signature
```java
public int countUnivalSubtrees(Object root)
```

## Suggested Test Cases
1. `input from Example 1` -> `output from Example 1`
2. `input from Example 2` -> `output from Example 2`
3. `input from Example 3` -> `output from Example 3`

## What To Watch For
- Use clear base cases for `null` children to avoid incorrect recursion results.
- Keep traversal order aligned with what the problem asks you to compute.
- Separate node-level work from subtree aggregation to prevent state bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `CountUnivalueSubtrees.java` contains the correct class name and Java method signature.
- `CountUnivalueSubtreesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `CountUnivalueSubtrees.java` - blank Java starter solution
- `CountUnivalueSubtreesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
