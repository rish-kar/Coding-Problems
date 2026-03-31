# 310. Minimum Height Trees

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Graph
- Folder Path: `leetcode/medium/binary_tree/310_minimum_height_trees`
- Folder Name: `310_minimum_height_trees`
- Official Link: https://leetcode.com/problems/minimum-height-trees/

## Problem Overview
A tree is an undirected graph in which any two vertices are connected by exactly one path. In other words, any connected graph without simple cycles is a tree.
You are given a tree of n nodes labelled from 0 to n - 1 , and an array of n - 1 edges where edges[i] = [a i , b i ] indicates that there is an undirected edge between the two nodes a i and b i in the tree, you can choose any node of the tree as the root. When you select a node x as the root, the result tree has height h . Among all possible rooted trees, those with minimum height (i.e. min(h) ) are called minimum height trees (MHTs).

## Java Starter Signature
```java
public List<Integer> findMinHeightTrees(int n, int[][] edges)
```

## Suggested Test Cases
1. `n = 4, edges = [[1,0],[1,2],[1,3]]` -> `[1]`
2. `n = 6, edges = [[3,0],[3,1],[3,2],[3,4],[5,4]]` -> `[3,4]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Cover edge inputs explicitly so `findMinHeightTrees` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MinimumHeightTrees.java` contains the correct class name and Java method signature.
- `MinimumHeightTreesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MinimumHeightTrees.java` - blank Java starter solution
- `MinimumHeightTreesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
