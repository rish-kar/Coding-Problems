# 388. Longest Absolute File Path

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/arrays/388_longest_absolute_file_path`
- Folder Name: `388_longest_absolute_file_path`
- Official Link: https://leetcode.com/problems/longest-absolute-file-path/

## Problem Overview
Suppose we have a file system that stores both files and directories. An example of one system is represented in the following picture
Here, we have dir as the only directory in the root. dir contains two subdirectories, subdir1 and subdir2 . subdir1 contains a file file1.ext and subdirectory subsubdir1 . subdir2 contains a subdirectory subsubdir2 , which contains a file file2.ext .

## Java Starter Signature
```java
public int lengthLongestPath(String input)
```

## Suggested Test Cases
1. `input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"` -> `20`
2. `input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"` -> `32`
3. `input = "a"` -> `0`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LongestAbsoluteFilePath.java` contains the correct class name and Java method signature.
- `LongestAbsoluteFilePathTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LongestAbsoluteFilePath.java` - blank Java starter solution
- `LongestAbsoluteFilePathTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
