# 83. Remove Duplicates from Sorted List

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Linked List
- Folder Path: `leetcode/easy/linked_list/83_remove_duplicates_from_sorted_list`
- Folder Name: `83_remove_duplicates_from_sorted_list`
- Official Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/

## Problem Overview
You are given the head of a sorted linked list, delete all duplicates such that each element appears only once . Then return the linked list sorted as well .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public ListNode deleteDuplicates(ListNode head)
```

## Suggested Test Cases
1. `head = [1,1,2]` -> `[1,2]`
2. `head = [1,1,2,3,3]` -> `[1,2,3]`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RemoveDuplicatesFromSortedList.java` contains the correct class name and Java method signature.
- `RemoveDuplicatesFromSortedListTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RemoveDuplicatesFromSortedList.java` - blank Java starter solution
- `RemoveDuplicatesFromSortedListTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
