# 208. Implement Trie (Prefix Tree)

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/binary_tree/208_implement_trie_prefix_tree`
- Folder Name: `208_implement_trie_prefix_tree`
- Official Link: https://leetcode.com/problems/implement-trie-prefix-tree/

## Problem Overview
A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store and retrieve keys in a dataset of strings. There are various applications of this data structure, such as autocomplete and spellchecker.
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public ImplementTriePrefixTree()
```

## Suggested Test Cases
1. `input from Example 1` -> `output from Example 1`
2. `input from Example 2` -> `output from Example 2`
3. `input from Example 3` -> `output from Example 3`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ImplementTriePrefixTree.java` contains the correct class name and Java method signature.
- `ImplementTriePrefixTreeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ImplementTriePrefixTree.java` - blank Java starter solution
- `ImplementTriePrefixTreeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
