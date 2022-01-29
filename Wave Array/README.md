# Wave Array 
### Easy Accuracy: 62.9% Submissions: 85912 Points: 2

Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it\
In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....\
\
If there are multiple solutions, find the lexicographically smallest one.

## Example 1:
<pre>
Input:
	n = 5
	arr[] = {1,2,3,4,5}
Output:
	2 1 4 3 5
Explanation:
	Array elements after sorting it in wave form are 
	2 1 4 3 5
</pre>

## Example 2:
<pre>
Input:
	n = 6
	arr[] = {2,4,7,8,9,10}
Output:
	4 2 8 7 10 9
Explanation:
	Array elements after 
	sorting it in wave form are 
	4 2 8 7 10 9
</pre>

## Your Task:
The task is to complete the function convertToWave(), which converts the given array to a wave array.

### Expected Time Complexity: O(n). Expected Auxiliary Space: O(1).


## Constraints:
1 ≤ n ≤ 10^6 \
0 ≤ arr[i] ≤10^7