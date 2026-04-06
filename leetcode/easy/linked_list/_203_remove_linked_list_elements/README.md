# 203. Remove Linked List Elements

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Linked List
- Folder Path: `leetcode/easy/linked_list/203_remove_linked_list_elements`
- Folder Name: `203_remove_linked_list_elements`
- Official Link: https://leetcode.com/problems/remove-linked-list-elements/

## Problem Overview
You are given the head of a linked list and an integer val , remove all the nodes of the linked list that has Node.val == val , and return the new head .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public ListNode removeElements(ListNode head, int val)
```

## Suggested Test Cases
1. `head = [1,2,6,3,4,5,6], val = 6` -> `[1,2,3,4,5]`
2. `head = [], val = 1` -> `[]`
3. `head = [7,7,7,7], val = 7` -> `[]`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RemoveLinkedListElements.java` contains the correct class name and Java method signature.
- `RemoveLinkedListElementsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RemoveLinkedListElements.java` - blank Java starter solution
- `RemoveLinkedListElementsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
