# 177. Nth Highest Salary

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: SQL
- Folder Path: `leetcode/medium/sql/177_nth_highest_salary`
- Folder Name: `177_nth_highest_salary`
- Official Link: https://leetcode.com/problems/nth-highest-salary/

## Problem Overview
Write a solution to find the n th highest distinct salary from the Employee table. If there are less than n distinct salaries, return null .
The result format is in the following example.

## Java Starter Signature
```java
public Object nth_highest_salary()
```

## Suggested Test Cases
1. `Employee table: +----+--------+ | id | salary | +----+--------+ | 1 | 100 | | 2 | 200 | | 3 | 300 | +----+--------+ n = 2` -> `+------------------------+ | getNthHighestSalary(2) | +------------------------+ | 200 | +------------------------+`
2. `Employee table: +----+--------+ | id | salary | +----+--------+ | 1 | 100 | +----+--------+ n = 2` -> `+------------------------+ | getNthHighestSalary(2) | +------------------------+ | null | +------------------------+`
3. `Scores = [3.50, 3.65, 4.00, 3.85, 4.00, 3.65]` -> `dense ranks = [1, 1, 2, 3, 3, 4]`

## What To Watch For
- Join tables on the correct keys before filtering or aggregating.
- Treat `NULL` handling explicitly where comparisons can drop rows unexpectedly.
- Return exactly the columns, aliases, and ordering required by the prompt.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `NthHighestSalary.java` contains the correct class name and Java method signature.
- `NthHighestSalaryTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `NthHighestSalary.java` - blank Java starter solution
- `NthHighestSalaryTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
