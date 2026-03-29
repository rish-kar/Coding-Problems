# 207. Course Schedule

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Graph
- Folder Path: `leetcode/medium/graph/207_course_schedule`
- Folder Name: `207_course_schedule`
- Official Link: https://leetcode.com/problems/course-schedule/

## Problem Overview
There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1 . You are given an array prerequisites where prerequisites[i] = [a i , b i ] indicates that you must take course b i first if you want to take course a i .
Return true if you can finish all courses. Otherwise, return false .

## Java Starter Signature
```java
public boolean canFinish(int numCourses, int[][] prerequisites)
```

## Suggested Test Cases
1. `numCourses = 2, prerequisites = [[1,0]]` -> `true`
2. `numCourses = 2, prerequisites = [[1,0],[0,1]]` -> `false`
3. `nums = []` -> `false`

## What To Watch For
- Cover edge inputs explicitly so `canFinish` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `CourseSchedule.java` contains the correct class name and Java method signature.
- `CourseScheduleTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `CourseSchedule.java` - blank Java starter solution
- `CourseScheduleTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
