# 237. Delete Node in a Linked List

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/linked_list/237_delete_node_in_a_linked_list`
- Folder Name: `237_delete_node_in_a_linked_list`
- Official Link: https://leetcode.com/problems/delete-node-in-a-linked-list/

## Problem Overview
There is a singly-linked list head and we want to delete a node node in it.
You are given the node to be deleted node . You will not be given access to the first node of head .

## Java Starter Signature
```java
public void deleteNode(ListNode node)
```

## Suggested Test Cases
1. `head = [4,5,1,9], node = 5` -> `[4,1,9]`
2. `head = [4,5,1,9], node = 1` -> `[4,5,9]`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `DeleteNodeInALinkedList.java` contains the correct class name and Java method signature.
- `DeleteNodeInALinkedListTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `DeleteNodeInALinkedList.java` - blank Java starter solution
- `DeleteNodeInALinkedListTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
