# 210. Course Schedule II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Graph
- Folder Path: `leetcode/medium/graph/210_course_schedule_ii`
- Folder Name: `210_course_schedule_ii`
- Official Link: https://leetcode.com/problems/course-schedule-ii/

## Problem Overview
There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1 . You are given an array prerequisites where prerequisites[i] = [a i , b i ] indicates that you must take course b i first if you want to take course a i .
Return the ordering of courses you should take to finish all courses . If there are many valid answers, return any of them. If it is impossible to finish all courses, return an empty array .

## Java Starter Signature
```java
public int[] findOrder(int numCourses, int[][] prerequisites)
```

## Suggested Test Cases
1. `numCourses = 2, prerequisites = [[1,0]]` -> `[0,1]`
2. `numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]` -> `[0,2,1,3]`
3. `numCourses = 1, prerequisites = []` -> `[0]`

## What To Watch For
- Cover edge inputs explicitly so `findOrder` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `CourseScheduleII.java` contains the correct class name and Java method signature.
- `CourseScheduleIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `CourseScheduleII.java` - blank Java starter solution
- `CourseScheduleIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
