# 138. Copy List with Random Pointer

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/linked_list/138_copy_list_with_random_pointer`
- Folder Name: `138_copy_list_with_random_pointer`
- Official Link: https://leetcode.com/problems/copy-list-with-random-pointer/

## Problem Overview
A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null .
Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list .

## Java Starter Signature
```java
public CopyListWithRandomPointer(int val)
```

## Suggested Test Cases
1. `head = [[7,null],[13,0],[11,4],[10,2],[1,0]]` -> `[[7,null],[13,0],[11,4],[10,2],[1,0]]`
2. `head = [[1,1],[2,1]]` -> `[[1,1],[2,1]]`
3. `head = [[3,null],[3,0],[3,null]]` -> `[[3,null],[3,0],[3,null]]`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `CopyListWithRandomPointer.java` contains the correct class name and Java method signature.
- `CopyListWithRandomPointerTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `CopyListWithRandomPointer.java` - blank Java starter solution
- `CopyListWithRandomPointerTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
