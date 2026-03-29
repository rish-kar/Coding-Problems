# 61. Rotate List

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/linked_list/61_rotate_list`
- Folder Name: `61_rotate_list`
- Official Link: https://leetcode.com/problems/rotate-list/

## Problem Overview
You are given the head of a linked list, rotate the list to the right by k places.
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public ListNode rotateRight(ListNode head, int k)
```

## Suggested Test Cases
1. `head = [1,2,3,4,5], k = 2` -> `[4,5,1,2,3]`
2. `head = [0,1,2], k = 4` -> `[2,0,1]`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RotateList.java` contains the correct class name and Java method signature.
- `RotateListTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RotateList.java` - blank Java starter solution
- `RotateListTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
