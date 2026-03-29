# 193. Valid Phone Numbers

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Shell
- Folder Path: `leetcode/easy/sql/193_valid_phone_numbers`
- Folder Name: `193_valid_phone_numbers`
- Official Link: https://leetcode.com/problems/valid-phone-numbers/

## Problem Overview
You are given a text file file.txt that contains a list of phone numbers (one per line), write a one-liner bash script to print all valid phone numbers.
You may assume that a valid phone number must appear in one of the following two formats: (xxx) xxx-xxxx or xxx-xxx-xxxx. (x means a digit)

## Java Starter Signature
```java
public Object solve()
```

## Suggested Test Cases
1. `small input file with 3-5 lines` -> `exact transformed output required by the command`
2. `input lines = ["a b", "c d"]` -> `output lines follow the required shell transformation`
3. `input file from Example 1` -> `output exactly matches Example 1`

## What To Watch For
- Cover edge inputs explicitly so `solve` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ValidPhoneNumbers.java` contains the correct class name and Java method signature.
- `ValidPhoneNumbersTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ValidPhoneNumbers.java` - blank Java starter solution
- `ValidPhoneNumbersTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
