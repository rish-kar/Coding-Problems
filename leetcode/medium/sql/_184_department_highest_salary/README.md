# 184. Department Highest Salary

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: SQL
- Folder Path: `leetcode/medium/sql/184_department_highest_salary`
- Folder Name: `184_department_highest_salary`
- Official Link: https://leetcode.com/problems/department-highest-salary/

## Problem Overview
Write a solution to find employees who have the highest salary in each of the departments.
Return the result table in any order .

## Java Starter Signature
```java
public Object department_highest_salary()
```

## Suggested Test Cases
1. `Employee table: +----+-------+--------+--------------+ | id | name | salary | departmentId | +----+-------+--------+--------------+ | 1 | Joe | 70000 | 1 | | 2 | Jim | 90000 | 1 | | 3 | Henry | 80000 | 2 | | 4 | Sam | 60000 | 2 | | 5 | Max | 90000 | 1 | +----+-------+--------+--------------+ Department table: +----+-------+ | id | name | +----+-------+ | 1 | IT | | 2 | Sales | +----+-------+` -> `+------------+----------+--------+ | Department | Employee | Salary | +------------+----------+--------+ | IT | Jim | 90000 | | Sales | Henry | 80000 | | IT | Max | 90000 | +------------+----------+--------+`
2. `Scores = [3.50, 3.65, 4.00, 3.85, 4.00, 3.65]` -> `dense ranks = [1, 1, 2, 3, 3, 4]`
3. `dataset from Example 1` -> `result set exactly matches Example 1`

## What To Watch For
- Join tables on the correct keys before filtering or aggregating.
- Treat `NULL` handling explicitly where comparisons can drop rows unexpectedly.
- Return exactly the columns, aliases, and ordering required by the prompt.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `DepartmentHighestSalary.java` contains the correct class name and Java method signature.
- `DepartmentHighestSalaryTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `DepartmentHighestSalary.java` - blank Java starter solution
- `DepartmentHighestSalaryTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
