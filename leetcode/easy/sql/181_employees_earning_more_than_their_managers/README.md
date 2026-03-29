# 181. Employees Earning More Than Their Managers

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: SQL
- Folder Path: `leetcode/easy/sql/181_employees_earning_more_than_their_managers`
- Folder Name: `181_employees_earning_more_than_their_managers`
- Official Link: https://leetcode.com/problems/employees-earning-more-than-their-managers/

## Problem Overview
Write a solution to find the employees who earn more than their managers.
Return the result table in any order .

## Java Starter Signature
```java
public Object find_employees()
```

## Suggested Test Cases
1. `Employee table: +----+-------+--------+-----------+ | id | name | salary | managerId | +----+-------+--------+-----------+ | 1 | Joe | 70000 | 3 | | 2 | Henry | 80000 | 4 | | 3 | Sam | 60000 | Null | | 4 | Max | 90000 | Null | +----+-------+--------+-----------+` -> `+----------+ | Employee | +----------+ | Joe | +----------+`
2. `Scores = [3.50, 3.65, 4.00, 3.85, 4.00, 3.65]` -> `dense ranks = [1, 1, 2, 3, 3, 4]`
3. `dataset from Example 1` -> `result set exactly matches Example 1`

## What To Watch For
- Join tables on the correct keys before filtering or aggregating.
- Treat `NULL` handling explicitly where comparisons can drop rows unexpectedly.
- Return exactly the columns, aliases, and ordering required by the prompt.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `EmployeesEarningMoreThanTheirManagers.java` contains the correct class name and Java method signature.
- `EmployeesEarningMoreThanTheirManagersTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `EmployeesEarningMoreThanTheirManagers.java` - blank Java starter solution
- `EmployeesEarningMoreThanTheirManagersTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
