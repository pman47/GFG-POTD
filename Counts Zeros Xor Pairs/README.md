# Counts Zeros Xor Pairs

### Easy Accuracy: 61.74% Submissions: 9202 Points: 2

---

Given an array A[] of size N. Find the number of pairs (i, j) such that
Ai XOR Aj = 0, and 1 ≤ i < j ≤ N.

## Example 1:

<pre>
Input : arr[ ] = {1, 3, 4, 1, 4}
Output : 2
Explanation:
Index( 0, 3 ) and (2 , 4 ) are only pairs 
whose xors is zero so count is 2.
</pre>

## Example 2:

<pre>
Input : arr[ ] = {2, 2, 2} 
Output :  3
</pre>

## Your Task:

This is a function problem. The input is already taken care of by the driver code. You only need to complete the function calculate() that takes an array (arr), sizeOfArray (n), and return the count of Zeros Xor's Pairs. The driver code takes care of the printing.

## Expected Time Complexity : O(N\*Log(N))

## Expected Auxiliary Space : O(1)

## Constraints:

- 2 ≤ N ≤ 10^5
- 1 ≤ A[i] ≤ 10^5
