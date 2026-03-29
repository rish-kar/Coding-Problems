# 117. Populating Next Right Pointers in Each Node II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/arrays/117_populating_next_right_pointers_in_each_node_ii`
- Folder Name: `117_populating_next_right_pointers_in_each_node_ii`
- Official Link: https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/

## Problem Overview
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL .
Initially, all next pointers are set to NULL .

## Java Starter Signature
```java
public PopulatingNextRightPointersInEachNodeII()
```

## Suggested Test Cases
1. `root = [1,2,3,4,5,null,7]` -> `[1,#,2,3,#,4,5,7,#]`
2. `root = []` -> `[]`
3. `second official example` -> `same expected output as the example`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PopulatingNextRightPointersInEachNodeII.java` contains the correct class name and Java method signature.
- `PopulatingNextRightPointersInEachNodeIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PopulatingNextRightPointersInEachNodeII.java` - blank Java starter solution
- `PopulatingNextRightPointersInEachNodeIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
