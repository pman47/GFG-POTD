# Form a palindrome

### Medium Accuracy: 62.31% Submissions: 7768 Points: 4

---

Given a string, find the minimum number of characters to be inserted to convert it to palindrome.\
For Example:\

- ab: Number of insertions required is 1. bab or aba
- aa: Number of insertions required is 0. aa
- abcd: Number of insertions required is 3. dcbabcd

## Example 1:

<pre>
Input:
abcd
Output:
3
Explanation:
Here we can append 3 characters in the 
beginning,and the resultant string will 
be a palindrome ("dcbabcd").
</pre>

## Example 2:

<pre>
Input:
aba
Output:
0
Explanation:
Given string is already a pallindrome hence
no insertions are required.
</pre>

## Your Task:

You don't need to read input or print anything. Your task is to complete the function findMinInsertions() which takes string S as input parameters and returns minimimum numser of insertions required.

## Expected Time Complexity : O(|S|^2)

## Expected Auxiliary Space : O(|S|^2)

## Constraints:

1<=n<=10^5
