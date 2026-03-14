# 19. Remove Nth Node From End of List

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/linked_list/19_remove_nth_node_from_end_of_list`
- Folder Name: `19_remove_nth_node_from_end_of_list`
- Official Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/

## Problem Overview
Delete the nth node from the end of the linked list and return the updated head.

## Java Starter Signature
```java
public ListNode removeNthFromEnd(ListNode head, int n)
```

The starter Java file also includes a lightweight `ListNode` definition so the folder compiles cleanly in isolation.

## Suggested Test Cases
1. `head = [1,2,3,4,5], n = 2 -> [1,2,3,5]`
2. `head = [1], n = 1 -> []`
3. `head = [1,2], n = 1 -> [1]`

## What To Watch For
- Handle an empty list and a single-node list before pointer rewiring gets complicated.
- Dummy nodes often simplify edge cases that affect the head of the list.
- Reconnect the remaining tail carefully so nodes are not lost or cycled by mistake.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RemoveNthNodeFromEndOfList.java` contains the correct class name and Java method signature.
- `RemoveNthNodeFromEndOfListTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RemoveNthNodeFromEndOfList.java` - blank Java starter solution
- `RemoveNthNodeFromEndOfListTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
