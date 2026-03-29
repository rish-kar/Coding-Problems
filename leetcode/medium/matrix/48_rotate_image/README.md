# 48. Rotate Image

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/matrix/48_rotate_image`
- Folder Name: `48_rotate_image`
- Official Link: https://leetcode.com/problems/rotate-image/

## Problem Overview
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place , which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

## Java Starter Signature
```java
public void rotate(int[][] matrix)
```

## Suggested Test Cases
1. `matrix = [[1,2,3],[4,5,6],[7,8,9]]` -> `[[7,4,1],[8,5,2],[9,6,3]]`
2. `matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]` -> `[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RotateImage.java` contains the correct class name and Java method signature.
- `RotateImageTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RotateImage.java` - blank Java starter solution
- `RotateImageTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
