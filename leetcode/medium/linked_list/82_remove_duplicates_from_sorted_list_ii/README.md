# 82. Remove Duplicates from Sorted List II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/linked_list/82_remove_duplicates_from_sorted_list_ii`
- Folder Name: `82_remove_duplicates_from_sorted_list_ii`
- Official Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/

## Problem Overview
Delete every value that appears more than once so only distinct values remain in the sorted list.

## Java Starter Signature
```java
public ListNode deleteDuplicates(ListNode head)
```

The starter Java file also includes a lightweight `ListNode` definition so the folder compiles cleanly in isolation.

## Suggested Test Cases
1. `head = [1,2,3,3,4,4,5] -> [1,2,5]`
2. `head = [1,1,1,2,3] -> [2,3]`
3. `head = [1,1] -> []`

## What To Watch For
- Handle an empty list and a single-node list before pointer rewiring gets complicated.
- Dummy nodes often simplify edge cases that affect the head of the list.
- Reconnect the remaining tail carefully so nodes are not lost or cycled by mistake.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RemoveDuplicatesFromSortedListII.java` contains the correct class name and Java method signature.
- `RemoveDuplicatesFromSortedListIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RemoveDuplicatesFromSortedListII.java` - blank Java starter solution
- `RemoveDuplicatesFromSortedListIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
