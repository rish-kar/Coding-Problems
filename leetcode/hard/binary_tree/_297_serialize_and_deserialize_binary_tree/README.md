# 297. Serialize and Deserialize Binary Tree

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Strings
- Folder Path: `leetcode/hard/binary_tree/297_serialize_and_deserialize_binary_tree`
- Folder Name: `297_serialize_and_deserialize_binary_tree`
- Official Link: https://leetcode.com/problems/serialize-and-deserialize-binary-tree/

## Problem Overview
Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.

## Java Starter Signature
```java
public String serialize(TreeNode root)
```

## Suggested Test Cases
1. `root = [1,2,3,null,null,4,5]` -> `[1,2,3,null,null,4,5]`
2. `root = []` -> `[]`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SerializeAndDeserializeBinaryTree.java` contains the correct class name and Java method signature.
- `SerializeAndDeserializeBinaryTreeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SerializeAndDeserializeBinaryTree.java` - blank Java starter solution
- `SerializeAndDeserializeBinaryTreeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
