# 337. House Robber III

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Tree
- Folder Path: `leetcode/medium/dynamic_programming/337_house_robber_iii`
- Folder Name: `337_house_robber_iii`
- Official Link: https://leetcode.com/problems/house-robber-iii/

## Problem Overview
The thief has found himself a new place for his thievery again. There is only one entrance to this area, called root .
Besides the root , each house has one and only one parent house. After a tour, the smart thief realized that all houses in this place form a binary tree. It will automatically contact the police if two directly-linked houses were broken into on the same night .

## Java Starter Signature
```java
public int rob(TreeNode root)
```

## Suggested Test Cases
1. `root = [3,2,3,null,3,null,1]` -> `7`
2. `root = [3,4,5,1,3,null,1]` -> `9`
3. `second official example` -> `same expected output as the example`

## What To Watch For
- Use clear base cases for `null` children to avoid incorrect recursion results.
- Keep traversal order aligned with what the problem asks you to compute.
- Separate node-level work from subtree aggregation to prevent state bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `HouseRobberIII.java` contains the correct class name and Java method signature.
- `HouseRobberIIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `HouseRobberIII.java` - blank Java starter solution
- `HouseRobberIIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
