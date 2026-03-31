# 146. LRU Cache

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/linked_list/146_lru_cache`
- Folder Name: `146_lru_cache`
- Official Link: https://leetcode.com/problems/lru-cache/

## Problem Overview
Design a data structure that follows the constraints of a Least Recently Used (LRU) cache .
The functions get and put must each run in O(1) average time complexity.

## Java Starter Signature
```java
public LRUCache(int capacity)
```

## Suggested Test Cases
1. `input from Example 1` -> `output from Example 1`
2. `input from Example 2` -> `output from Example 2`
3. `input from Example 3` -> `output from Example 3`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LRUCache.java` contains the correct class name and Java method signature.
- `LRUCacheTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LRUCache.java` - blank Java starter solution
- `LRUCacheTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
