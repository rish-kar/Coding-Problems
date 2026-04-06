# 355. Design Twitter

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/arrays/355_design_twitter`
- Folder Name: `355_design_twitter`
- Official Link: https://leetcode.com/problems/design-twitter/

## Problem Overview
Design a simplified version of Twitter where users can post tweets, follow/unfollow another user, and is able to see the 10 most recent tweets in the user's news feed.
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public DesignTwitter()
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

- `DesignTwitter.java` contains the correct class name and Java method signature.
- `DesignTwitterTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `DesignTwitter.java` - blank Java starter solution
- `DesignTwitterTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
