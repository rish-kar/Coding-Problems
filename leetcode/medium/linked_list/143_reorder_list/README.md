# 143. Reorder List

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/linked_list/143_reorder_list`
- Folder Name: `143_reorder_list`
- Official Link: https://leetcode.com/problems/reorder-list/

## Problem Overview
You are given the head of a singly linked-list. The list can be represented as
Reorder the list to be on the following form

## Java Starter Signature
```java
public void reorderList(ListNode head)
```

## Suggested Test Cases
1. `head = [1,2,3,4]` -> `[1,4,2,3]`
2. `head = [1,2,3,4,5]` -> `[1,5,2,4,3]`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ReorderList.java` contains the correct class name and Java method signature.
- `ReorderListTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ReorderList.java` - blank Java starter solution
- `ReorderListTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
