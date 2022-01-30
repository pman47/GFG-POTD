# Coins of Geekland 
### Medium Accuracy: 64.23% Submissions: 4295 Points: 4
---

In Geekland there is a grid of coins of size N x N. You have to find the maximum sum of coins in any sub-grid of size K x K.\
\
Note: Coins of the negative denomination are also possible at Geekland.

## Example 1:
<pre>
Input:
	N = 5, K = 3 
	a[[]] = {1, 1, 1, 1, 1} 
		{2, 2, 2, 2, 2} 
		{3, 8, 6, 7, 3} 
		{4, 4, 4, 4, 4} 
		{5, 5, 5, 5, 5}
Output:
	48
Explanation:
	{8, 6, 7}
	{4, 4, 4}
    	{5, 5, 5}
	has the maximum sum
</pre>

## Example 2:
<pre>
Input:
	N = 1, K = 1
	a[[]] = {{4}}
Output:
	4
</pre>

## Your Task:
You don't need to read input or print anything.\ Complete the function Maximum_Sum() which takes the matrix mat[], size of Matrix N, and value K as input parameters and returns the maximum sum.

### Expected Time Complexity: O(N^2) , Expected Auxiliary Space: O(N^2)


## Constraints:
1 ≤ K ≤ N ≤ 103 \
-5*10^5 ≤ mat[i][j] ≤ 5*10^5
