# Smallest window containing 0, 1 and 2

### Easy Accuracy: 69.73% Submissions: 1713 Points: 2

---

Given a string S consisting of the characters 0, 1 and 2. Your task is to find the length of the smallest substring of string S that contains all the three characters 0, 1 and 2. If no such substring exists, then return -1.

## Example 1:

<pre>
Input:
	S = "01212"
Output:
	3
Explanation:
	The substring 012 is the smallest substring that contains the characters 0, 1 and 2.
</pre>

## Example 2:

<pre>
Input: 
	S = "12121"
Output:
	-1
Explanation: 
	As the character 0 is not present in the string S, therefor no substring containing all the three characters 0, 1 and 2 exists. Hence, the answer is -1 in this case.
</pre>

## Your Task:

Complete the function smallestSubstring() which takes the string S as input, and returns the length of the smallest substring of string S that contains all the three characters 0, 1 and 2.

### Expected Time Complexity: O(|S|) , Expected Auxiliary Space: O(1)

## Constraints:

- 1 ≤ |S| ≤ 10^5
- All the characters of String S lies in the set {'0', '1', '2'}
