# 122. Best Time to Buy and Sell Stock II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/122_best_time_to_buy_and_sell_stock_ii`
- Folder Name: `122_best_time_to_buy_and_sell_stock_ii`
- Official Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

## Problem Overview
You are given an integer array prices where prices[i] is the price of a given stock on the i th day.
On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can sell and buy the stock multiple times on the same day , ensuring you never hold more than one share of the stock.

## Java Starter Signature
```java
public int maxProfit(int[] prices)
```

## Suggested Test Cases
1. `prices = [7,1,5,3,6,4]` -> `7`
2. `prices = [1,2,3,4,5]` -> `4`
3. `prices = [7,6,4,3,1]` -> `0`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BestTimeToBuyAndSellStockII.java` contains the correct class name and Java method signature.
- `BestTimeToBuyAndSellStockIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BestTimeToBuyAndSellStockII.java` - blank Java starter solution
- `BestTimeToBuyAndSellStockIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
