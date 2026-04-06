# 328. Odd Even Linked List

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/linked_list/328_odd_even_linked_list`
- Folder Name: `328_odd_even_linked_list`
- Official Link: https://leetcode.com/problems/odd-even-linked-list/

## Problem Overview
You are given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list .
The first node is considered odd , and the second node is even , and so on.

## Java Starter Signature
```java
public ListNode oddEvenList(ListNode head)
```

## Suggested Test Cases
1. `head = [1,2,3,4,5]` -> `[1,3,5,2,4]`
2. `head = [2,1,3,5,6,4,7]` -> `[2,3,6,7,1,5,4]`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `OddEvenLinkedList.java` contains the correct class name and Java method signature.
- `OddEvenLinkedListTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `OddEvenLinkedList.java` - blank Java starter solution
- `OddEvenLinkedListTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
