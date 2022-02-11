# Remove leading zeros from an IP address
### Medium Accuracy: 60.19% Submissions: 3528 Points: 4
---

Given an IP address, remove leading zeros from the IP address. Note that our IP address here can be a little different.\
It can have numbers greater than 255. Also, it does not necessarily have 4 numbers. The count can be lesser/more.

## Example 1:
<pre>
Input:
	S = "100.020.003.400"
Output:
	100.20.3.400
Explanation:
	The leading zeros are removed from 20 and 3.
</pre>

## Example 2:
<pre>
Input:
	S = "100.000.010.0999"
Output:
	100.0.10.999
Explanation:
	The leading zeros are removed from 0, 10 and 999.
</pre>

## Your Task:
You don't need to read input or print anything.\
Your task is to complete the function newIPAdd() which takes the string S representing the IP address as input and returns a string representing the resultant IP address.

### Expected Time Complexity: O(|S|) , Expected Auxiliary Space: O(|S|)


## Constraints:
1<=|S|<=1000