# 386. Lexicographical Numbers

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Trie
- Folder Path: `leetcode/medium/graph/386_lexicographical_numbers`
- Folder Name: `386_lexicographical_numbers`
- Official Link: https://leetcode.com/problems/lexicographical-numbers/

## Problem Overview
You are given an integer n , return all the numbers in the range [1, n] sorted in lexicographical order.
You must write an algorithm that runs in O(n) time and uses O(1) extra space.

## Java Starter Signature
```java
public List<Integer> lexicalOrder(int n)
```

## Suggested Test Cases
1. `n = 13` -> `[1,10,11,12,13,2,3,4,5,6,7,8,9]`
2. `n = 2` -> `[1,2]`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Cover edge inputs explicitly so `lexicalOrder` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LexicographicalNumbers.java` contains the correct class name and Java method signature.
- `LexicographicalNumbersTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LexicographicalNumbers.java` - blank Java starter solution
- `LexicographicalNumbersTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
