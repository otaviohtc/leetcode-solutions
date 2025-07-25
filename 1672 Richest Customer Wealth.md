# 1672. Richest Customer Wealth

You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

## Notes

Basic iterating through the accounts and putting the values in a temporary variable. 
Then, using Math.max to compare the maxSoFar with the temp, and assigning the biggest of them to maxSoFar. 
It's a bit stupid how the whole problem is resolved with Math.max, I thought the idea was meself creating the logic for that, but I digress.