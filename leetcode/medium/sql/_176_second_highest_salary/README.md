# 176. Second Highest Salary

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: SQL
- Folder Path: `leetcode/medium/sql/176_second_highest_salary`
- Folder Name: `176_second_highest_salary`
- Official Link: https://leetcode.com/problems/second-highest-salary/

## Problem Overview
Write a solution to find the second highest distinct salary from the Employee table. If there is no second highest salary, return null (return None in Pandas) .
The result format is in the following example.

## Java Starter Signature
```java
public Object second_highest_salary()
```

## Suggested Test Cases
1. `Employee table: +----+--------+ | id | salary | +----+--------+ | 1 | 100 | | 2 | 200 | | 3 | 300 | +----+--------+` -> `+---------------------+ | SecondHighestSalary | +---------------------+ | 200 | +---------------------+`
2. `Employee table: +----+--------+ | id | salary | +----+--------+ | 1 | 100 | +----+--------+` -> `+---------------------+ | SecondHighestSalary | +---------------------+ | null | +---------------------+`
3. `Scores = [3.50, 3.65, 4.00, 3.85, 4.00, 3.65]` -> `dense ranks = [1, 1, 2, 3, 3, 4]`

## What To Watch For
- Join tables on the correct keys before filtering or aggregating.
- Treat `NULL` handling explicitly where comparisons can drop rows unexpectedly.
- Return exactly the columns, aliases, and ordering required by the prompt.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SecondHighestSalary.java` contains the correct class name and Java method signature.
- `SecondHighestSalaryTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SecondHighestSalary.java` - blank Java starter solution
- `SecondHighestSalaryTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
