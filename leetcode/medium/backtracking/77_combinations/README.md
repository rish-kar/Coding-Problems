# 77. Combinations

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Backtracking
- Folder Path: `leetcode/medium/backtracking/77_combinations`
- Folder Name: `77_combinations`
- Official Link: https://leetcode.com/problems/combinations/

## Problem Overview
You are given two integers n and k , return all possible combinations of k numbers chosen from the range [1, n] .
You may return the answer in any order .

## Java Starter Signature
```java
public List<List<Integer>> combine(int n, int k)
```

## Suggested Test Cases
1. `n = 4, k = 2` -> `[[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]`
2. `n = 1, k = 1` -> `[[1]]`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Cover edge inputs explicitly so `combine` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `Combinations.java` contains the correct class name and Java method signature.
- `CombinationsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `Combinations.java` - blank Java starter solution
- `CombinationsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
