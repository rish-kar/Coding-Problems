# 133. Clone Graph

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Hash Map
- Folder Path: `leetcode/medium/graph/133_clone_graph`
- Folder Name: `133_clone_graph`
- Official Link: https://leetcode.com/problems/clone-graph/

## Problem Overview
You are given a reference of a node in a connected undirected graph.
Return a deep copy (clone) of the graph.

## Java Starter Signature
```java
public CloneGraph()
```

## Suggested Test Cases
1. `adjList = [[2,4],[1,3],[2,4],[1,3]]` -> `[[2,4],[1,3],[2,4],[1,3]]`
2. `adjList = [[]]` -> `[[]]`
3. `adjList = []` -> `[]`

## What To Watch For
- Cover edge inputs explicitly so method behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `CloneGraph.java` contains the correct class name and Java method signature.
- `CloneGraphTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `CloneGraph.java` - blank Java starter solution
- `CloneGraphTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
