# 71. Simplify Path

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/stack/71_simplify_path`
- Folder Name: `71_simplify_path`
- Official Link: https://leetcode.com/problems/simplify-path/

## Problem Overview
You are given an absolute path for a Unix-style file system, which always begins with a slash '/' . Your task is to transform this absolute path into its simplified canonical path .
The rules of a Unix-style file system are as follows

## Java Starter Signature
```java
public String simplifyPath(String path)
```

## Suggested Test Cases
1. `path = "/home/"` -> `"/home"`
2. `path = "/home//foo/"` -> `"/home/foo"`
3. `path = "/home/user/Documents/../Pictures"` -> `"/home/user/Pictures"`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SimplifyPath.java` contains the correct class name and Java method signature.
- `SimplifyPathTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SimplifyPath.java` - blank Java starter solution
- `SimplifyPathTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
