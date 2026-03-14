# 92. Reverse Linked List II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/linked_list/92_reverse_linked_list_ii`
- Folder Name: `92_reverse_linked_list_ii`
- Official Link: https://leetcode.com/problems/reverse-linked-list-ii/

## Problem Overview
Reverse the linked list nodes from position left to right and keep the rest unchanged.

## Java Starter Signature
```java
public ListNode reverseBetween(ListNode head, int left, int right)
```

The starter Java file also includes a lightweight `ListNode` definition so the folder compiles cleanly in isolation.

## Suggested Test Cases
1. `head = [1,2,3,4,5], left = 2, right = 4 -> [1,4,3,2,5]`
2. `head = [5], left = 1, right = 1 -> [5]`
3. `head = [3,5], left = 1, right = 2 -> [5,3]`

## What To Watch For
- Handle an empty list and a single-node list before pointer rewiring gets complicated.
- Dummy nodes often simplify edge cases that affect the head of the list.
- Reconnect the remaining tail carefully so nodes are not lost or cycled by mistake.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ReverseLinkedListII.java` contains the correct class name and Java method signature.
- `ReverseLinkedListIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ReverseLinkedListII.java` - blank Java starter solution
- `ReverseLinkedListIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
