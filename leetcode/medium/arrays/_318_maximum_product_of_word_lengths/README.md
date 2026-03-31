# 318. Maximum Product of Word Lengths

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/arrays/318_maximum_product_of_word_lengths`
- Folder Name: `318_maximum_product_of_word_lengths`
- Official Link: https://leetcode.com/problems/maximum-product-of-word-lengths/

## Problem Overview
You are given a string array words , return the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters . If no such two words exist, return 0 .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int maxProduct(String[] words)
```

## Suggested Test Cases
1. `words = ["abcw","baz","foo","bar","xtfn","abcdef"]` -> `16`
2. `words = ["a","ab","abc","d","cd","bcd","abcd"]` -> `4`
3. `words = ["a","aa","aaa","aaaa"]` -> `0`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MaximumProductOfWordLengths.java` contains the correct class name and Java method signature.
- `MaximumProductOfWordLengthsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MaximumProductOfWordLengths.java` - blank Java starter solution
- `MaximumProductOfWordLengthsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
