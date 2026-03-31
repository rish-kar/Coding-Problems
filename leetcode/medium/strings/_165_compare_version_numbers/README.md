# 165. Compare Version Numbers

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/strings/165_compare_version_numbers`
- Folder Name: `165_compare_version_numbers`
- Official Link: https://leetcode.com/problems/compare-version-numbers/

## Problem Overview
You are given two version strings , version1 and version2 , compare them. A version string consists of revisions separated by dots '.' . The value of the revision is its integer conversion ignoring leading zeros.
To compare version strings, compare their revision values in left-to-right order . If one of the version strings has fewer revisions, treat the missing revision values as 0 .

## Java Starter Signature
```java
public int compareVersion(String version1, String version2)
```

## Suggested Test Cases
1. `version1 = "1.2", version2 = "1.10"` -> `-1`
2. `version1 = "1.01", version2 = "1.001"` -> `0`
3. `version1 = "1.0", version2 = "1.0.0.0"` -> `0`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `CompareVersionNumbers.java` contains the correct class name and Java method signature.
- `CompareVersionNumbersTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `CompareVersionNumbers.java` - blank Java starter solution
- `CompareVersionNumbersTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
