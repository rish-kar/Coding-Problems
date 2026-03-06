# Coding Problems

A long-term coding practice repository for organizing problem solutions across multiple platforms in a clean, scalable, and interview-prep-friendly structure.

## Repository goals

- keep problems grouped by **platform** first
- normalize difficulty across platforms
- organize each difficulty by reusable **topic**
- keep each future problem self-contained in its own folder

## Structure

```text
coding-problems/
├─ _templates/
├─ _notes/
├─ _unsorted/
├─ leetcode/
├─ hackerrank/
├─ spoj/
├─ codeforces/
├─ codechef/
├─ geeksforgeeks/
├─ interviewbit/
├─ atcoder/
└─ cses/
```

Each platform follows this pattern:

```text
platform/
├─ basic/
├─ easy/
├─ medium/
├─ hard/
├─ advanced/
├─ contest/
└─ uncategorized/
```

Each difficulty contains reusable topic folders such as:

- arrays
- strings
- linked-list
- stack
- queue
- deque
- hash-map
- hash-set
- trees
- binary-tree
- binary-search-tree
- heap
- priority-queue
- graph
- trie
- recursion
- backtracking
- dynamic-programming
- greedy
- sliding-window
- two-pointers
- binary-search
- sorting
- matrix
- bit-manipulation
- math
- prefix-sum
- union-find
- monotonic-stack
- monotonic-queue
- linked-hash-map
- design
- implementation
- simulation
- intervals
- geometry
- number-theory
- segment-tree
- fenwick-tree
- topological-sort
- shortest-path
- bfs
- dfs
- uncategorized

## Future problem folder pattern

Later, each problem should live inside its own folder at the topic level using this naming style:

```text
problem-number-problem-name/
```

Examples:

- `1-two-sum`
- `206-reverse-linked-list`
- `102-binary-tree-level-order-traversal`

A future problem folder may contain:

- `README.md`
- solution files
- notes
- test cases

## Utility folders

- `_templates/` → reusable starter material for future problem folders
- `_notes/` → general study notes, patterns, and revision material
- `_unsorted/` → temporary holding area before a problem is fully categorized

## Note about empty folders in Git

Git does not track empty directories by itself. To preserve this directory-only structure in the remote repository, placeholder `.gitkeep` files are used in empty folders where needed.

