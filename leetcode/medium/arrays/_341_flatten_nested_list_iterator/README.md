# 341. Flatten Nested List Iterator

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Stack
- Folder Path: `leetcode/medium/arrays/341_flatten_nested_list_iterator`
- Folder Name: `341_flatten_nested_list_iterator`
- Official Link: https://leetcode.com/problems/flatten-nested-list-iterator/

## Problem Overview
You are given a nested list of integers nestedList . Each element is either an integer or a list whose elements may also be integers or other lists. Implement an iterator to flatten it.
Your code will be tested with the following pseudocode

## Java Starter Signature
```java
public FlattenNestedListIterator(List<NestedInteger> nestedList)
```

## Suggested Test Cases
1. `nestedList = [[1,1],2,[1,1]]` -> `[1,1,2,1,1]`
2. `nestedList = [1,[4,[6]]]` -> `[1,4,6]`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Cover edge inputs explicitly so method behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `FlattenNestedListIterator.java` contains the correct class name and Java method signature.
- `FlattenNestedListIteratorTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `FlattenNestedListIterator.java` - blank Java starter solution
- `FlattenNestedListIteratorTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
