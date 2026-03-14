# 71. Simplify Path

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Stack
- Folder Path: `leetcode/medium/stack/71_simplify_path`
- Folder Name: `71_simplify_path`
- Official Link: https://leetcode.com/problems/simplify-path/

## Problem Overview
Convert the Unix-style path into its canonical simplified form.

## Java Starter Signature
```java
public String simplifyPath(String path)
```


## Suggested Test Cases
1. `path = "/home/" -> "/home"`
2. `path = "/../" -> "/"`
3. `path = "/home//foo/" -> "/home/foo"`

## What To Watch For
- A stack is only helpful if you know what invariant each element represents.
- Unmatched opening and closing symbols should be handled explicitly.
- Do not forget any cleanup step after the main scan finishes.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SimplifyPath.java` contains the correct class name and Java method signature.
- `SimplifyPathTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SimplifyPath.java` - blank Java starter solution
- `SimplifyPathTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
