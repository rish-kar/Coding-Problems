# 174. Dungeon Game

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/dynamic_programming/174_dungeon_game`
- Folder Name: `174_dungeon_game`
- Official Link: https://leetcode.com/problems/dungeon-game/

## Problem Overview
The demons had captured the princess and imprisoned her in the bottom-right corner of a dungeon . The dungeon consists of m x n rooms laid out in a 2D grid. Our valiant knight was initially positioned in the top-left room and must fight his way through dungeon to rescue the princess.
The knight has an initial health point represented by a positive integer. If at any point his health point drops to 0 or below, he dies immediately.

## Java Starter Signature
```java
public int calculateMinimumHP(int[][] dungeon)
```

## Suggested Test Cases
1. `dungeon = [[-2,-3,3],[-5,-10,1],[10,30,-5]]` -> `7`
2. `dungeon = [[0]]` -> `1`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `DungeonGame.java` contains the correct class name and Java method signature.
- `DungeonGameTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `DungeonGame.java` - blank Java starter solution
- `DungeonGameTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
