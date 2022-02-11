class Solution
{
    public String newIPAdd(String s)
    {
        String res = "";
        String []arr = s.split("\\.");
        for(int i =0;i<arr.length;i++)
        {
            res+= (new java.math.BigInteger(arr[i]));
            
            if(i<arr.length-1)
            {
                res+=".";
            }
        }
        return res;
    }
}