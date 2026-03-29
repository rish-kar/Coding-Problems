# 185. Department Top Three Salaries

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: SQL
- Folder Path: `leetcode/hard/sql/185_department_top_three_salaries`
- Folder Name: `185_department_top_three_salaries`
- Official Link: https://leetcode.com/problems/department-top-three-salaries/

## Problem Overview
A company's executives are interested in seeing who earns the most money in each of the company's departments. A high earner in a department is an employee who has a salary in the top three unique salaries for that department.
Write a solution to find the employees who are high earners in each of the departments.

## Java Starter Signature
```java
public Object top_three_salaries()
```

## Suggested Test Cases
1. `Employee table: +----+-------+--------+--------------+ | id | name | salary | departmentId | +----+-------+--------+--------------+ | 1 | Joe | 85000 | 1 | | 2 | Henry | 80000 | 2 | | 3 | Sam | 60000 | 2 | | 4 | Max | 90000 | 1 | | 5 | Janet | 69000 | 1 | | 6 | Randy | 85000 | 1 | | 7 | Will | 70000 | 1 | +----+-------+--------+--------------+ Department table: +----+-------+ | id | name | +----+-------+ | 1 | IT | | 2 | Sales | +----+-------+` -> `+------------+----------+--------+ | Department | Employee | Salary | +------------+----------+--------+ | IT | Max | 90000 | | IT | Joe | 85000 | | IT | Randy | 85000 | | IT | Will | 70000 | | Sales | Henry | 80000 | | Sales | Sam | 60000 | +------------+----------+--------+`
2. `Scores = [3.50, 3.65, 4.00, 3.85, 4.00, 3.65]` -> `dense ranks = [1, 1, 2, 3, 3, 4]`
3. `dataset from Example 1` -> `result set exactly matches Example 1`

## What To Watch For
- Join tables on the correct keys before filtering or aggregating.
- Treat `NULL` handling explicitly where comparisons can drop rows unexpectedly.
- Return exactly the columns, aliases, and ordering required by the prompt.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `DepartmentTopThreeSalaries.java` contains the correct class name and Java method signature.
- `DepartmentTopThreeSalariesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `DepartmentTopThreeSalaries.java` - blank Java starter solution
- `DepartmentTopThreeSalariesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
