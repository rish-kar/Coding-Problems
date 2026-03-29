# 92. Reverse Linked List II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/linked_list/92_reverse_linked_list_ii`
- Folder Name: `92_reverse_linked_list_ii`
- Official Link: https://leetcode.com/problems/reverse-linked-list-ii/

## Problem Overview
You are given the head of a singly linked list and two integers left and right where left , reverse the nodes of the list from position left to position right , and return the reversed list .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public ListNode reverseBetween(ListNode head, int left, int right)
```

## Suggested Test Cases
1. `head = [1,2,3,4,5], left = 2, right = 4` -> `[1,4,3,2,5]`
2. `head = [5], left = 1, right = 1` -> `[5]`
3. `second official example` -> `same expected output as the example`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ReverseLinkedListII.java` contains the correct class name and Java method signature.
- `ReverseLinkedListIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ReverseLinkedListII.java` - blank Java starter solution
- `ReverseLinkedListIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
