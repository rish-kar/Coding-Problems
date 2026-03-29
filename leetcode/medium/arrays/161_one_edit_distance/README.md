# 161. One Edit Distance

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/arrays/161_one_edit_distance`
- Folder Name: `161_one_edit_distance`
- Official Link: https://leetcode.com/problems/one-edit-distance/

## Problem Overview
Implement the core logic for One Edit Distance exactly as the prompt defines.
Process the string input according to the matching or transformation rule in the prompt.

## Java Starter Signature
```java
public boolean isOneEditDistance(String s, String t)
```

## Suggested Test Cases
1. `s = "", t = ""` -> `true`
2. `s = "a", t = ""` -> `false`
3. `s = "abc", t = "abc"` -> `true`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `OneEditDistance.java` contains the correct class name and Java method signature.
- `OneEditDistanceTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `OneEditDistance.java` - blank Java starter solution
- `OneEditDistanceTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
