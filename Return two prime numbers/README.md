# Return two prime numbers

### Hard Accuracy: 79.22% Submissions: 4305 Points: 8

---

Given an even number N (greater than 2), return two prime numbers whose sum will be equal to given number. There are several combinations possible. Print only the pair whose minimum value is the smallest among all the minimum values of pairs and print the minimum element first.

## Example 1:

<pre>
Input:
	N = 74
Output:
	3 71
Explaination:
	There are several possibilities like 37 37. But the minimum value of this pair is 3 which is smallest among all possible minimum values of all the pairs.
</pre>

## Example 2:

<pre>
Input:
	4
Output:
	2 2
Explaination:
	This is the only possible prtitioning of 4.
</pre>

## Your Task:

You do not need to read input or print anything. Your task is to complete the function primeDivision() which takes N as input parameter and returns the partition satisfying the condition.

### Expected Time Complexity: O(N\*log(logN)) , Expected Auxiliary Space: O(N)

## Constraints:

1 ≤ N ≤ 10^4
