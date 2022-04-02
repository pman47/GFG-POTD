# Move all zeros to the front of the linked list

### Easy Accuracy: 50.31% Submissions: 12211 Points: 2

---

Given a linked list, the task is to move all 0s to the front of the linked list. The order of all another element except 0 should be same after rearrangement.

## Example 1:

<pre>
Input:  0 -> 4 -> 0 -> 5 -> 0
Output: 0 -> 0 -> 0 -> 4 -> 5
Explanation: After moving all 0s of the given
list to the front, the list is:
0 -> 0 -> 0 -> 4 -> 5
</pre>

## Example 2:

<pre>
Input: 0 -> 1 -> 0 -> 1 -> 2
Output: 0 -> 0 -> 1 -> 1 -> 2
</pre>

## Your Task:

You don't need to read input or print anything. Your task is to complete the function moveZeroes() which takes head node of the linked list as input parameter.

## Expected Time Complexity : O(N)

## Expected Auxiliary Space : O(1)

## Constraints:

- 1 ≤ N ≤ 50
