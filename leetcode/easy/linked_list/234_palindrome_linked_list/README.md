# 234. Palindrome Linked List

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Linked List
- Folder Path: `leetcode/easy/linked_list/234_palindrome_linked_list`
- Folder Name: `234_palindrome_linked_list`
- Official Link: https://leetcode.com/problems/palindrome-linked-list/

## Problem Overview
You are given the head of a singly linked list, return true if it is a palindrome or false otherwise .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public boolean isPalindrome(ListNode head)
```

## Suggested Test Cases
1. `head = [1,2,2,1]` -> `true`
2. `head = [1,2]` -> `false`
3. `input = []` -> `true`

## What To Watch For
- Handle odd and even length cases correctly when comparing mirrored characters.
- Normalize or skip non-relevant characters only if the problem statement requires it.
- Stop early once a mismatch proves the answer cannot be valid.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PalindromeLinkedList.java` contains the correct class name and Java method signature.
- `PalindromeLinkedListTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PalindromeLinkedList.java` - blank Java starter solution
- `PalindromeLinkedListTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
