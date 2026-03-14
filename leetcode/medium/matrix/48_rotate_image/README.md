# 48. Rotate Image

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Matrix
- Folder Path: `leetcode/medium/matrix/48_rotate_image`
- Folder Name: `48_rotate_image`
- Official Link: https://leetcode.com/problems/rotate-image/

## Problem Overview
Rotate the square matrix by 90 degrees clockwise in place.

## Java Starter Signature
```java
public void rotate(int[][] matrix)
```


## Suggested Test Cases
1. `matrix = [[1,2,3],[4,5,6],[7,8,9]] -> [[7,4,1],[8,5,2],[9,6,3]]`
2. `matrix = [[1,2],[3,4]] -> [[3,1],[4,2]]`
3. `a 1x1 matrix stays unchanged`

## What To Watch For
- Always keep row and column bounds separate so rectangular inputs still work.
- If you mutate the matrix in place, decide which cells can safely act as markers.
- Traversal problems usually need a clear visited rule or shrinking boundary rule.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RotateImage.java` contains the correct class name and Java method signature.
- `RotateImageTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RotateImage.java` - blank Java starter solution
- `RotateImageTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
