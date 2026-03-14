# 83. Remove Duplicates from Sorted List

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Linked List
- Folder Path: `leetcode/easy/linked_list/83_remove_duplicates_from_sorted_list`
- Folder Name: `83_remove_duplicates_from_sorted_list`
- Official Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/

## Problem Overview
Collapse repeated values in the sorted list so each value appears once.

## Java Starter Signature
```java
public ListNode deleteDuplicates(ListNode head)
```

The starter Java file also includes a lightweight `ListNode` definition so the folder compiles cleanly in isolation.

## Suggested Test Cases
1. `head = [1,1,2] -> [1,2]`
2. `head = [1,1,2,3,3] -> [1,2,3]`
3. `head = [] -> []`

## What To Watch For
- Handle an empty list and a single-node list before pointer rewiring gets complicated.
- Dummy nodes often simplify edge cases that affect the head of the list.
- Reconnect the remaining tail carefully so nodes are not lost or cycled by mistake.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RemoveDuplicatesFromSortedList.java` contains the correct class name and Java method signature.
- `RemoveDuplicatesFromSortedListTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RemoveDuplicatesFromSortedList.java` - blank Java starter solution
- `RemoveDuplicatesFromSortedListTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
