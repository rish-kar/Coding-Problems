# 61. Rotate List

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/linked_list/61_rotate_list`
- Folder Name: `61_rotate_list`
- Official Link: https://leetcode.com/problems/rotate-list/

## Problem Overview
Rotate the linked list to the right by k positions.

## Java Starter Signature
```java
public ListNode rotateRight(ListNode head, int k)
```

The starter Java file also includes a lightweight `ListNode` definition so the folder compiles cleanly in isolation.

## Suggested Test Cases
1. `head = [1,2,3,4,5], k = 2 -> [4,5,1,2,3]`
2. `head = [0,1,2], k = 4 -> [2,0,1]`
3. `head = [], k = 0 -> []`

## What To Watch For
- Handle an empty list and a single-node list before pointer rewiring gets complicated.
- Dummy nodes often simplify edge cases that affect the head of the list.
- Reconnect the remaining tail carefully so nodes are not lost or cycled by mistake.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RotateList.java` contains the correct class name and Java method signature.
- `RotateListTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RotateList.java` - blank Java starter solution
- `RotateListTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
