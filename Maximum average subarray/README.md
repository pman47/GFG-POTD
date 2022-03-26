# Maximum average subarray

### Easy Accuracy: 47.86% Submissions: 4311 Points: 2

---

Given an array Arr of size N and a positive integer K, find the sub-array of length K with the maximum average.

## Example 1:

<pre>
Input:
K = 4, N = 6
Arr[] = {1, 12, -5, -6, 50, 3}
Output: 12 -5 -6 50
Explanation: Maximum average is 
(12 - 5 - 6 + 50)/4 = 51/4.
</pre>

## Example 2:

<pre>
Input:
K = 3, N = 7
Arr[] = {3, -435, 335, 10, -50, 100, 20}
Output: 335 10 -50
Explanation: Maximum average is 
(335 + 10 - 50)/3 = 295/3.
</pre>

## Your Task:

You don't need to read input or print anything. Your task is to complete the function findMaxAverage() which takes the array of integers arr, its size n and integer k as input parameters and returns an integer denoting the starting index of the subarray.

### Expected Time Complexity: O(N) , Expected Auxiliary Space: O(1)

## Constraints:

- 1 <= N <= 10^5
- 0 <= |Arr[i]| <= 10^3
