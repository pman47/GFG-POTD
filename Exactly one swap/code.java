class Solution 
{ 
    long countStrings(String S) 
    { 
        // code here
        long a[]=new long[26];
        int y=0;
        long l=S.length();
        for(int i=0;i<l;i++)
        {
            char ch=S.charAt(i);
            a[ch-'a']++;
        }
        long sum=0;
       // System.out.println(Arrays.toString(a));
        long ans=(l*(l-1))/2;
       // System.out.println(ans);
        for(int i=0;i<26;i++)
        {
            if(a[i]>=2)
            {
                long l1=(a[i]*(a[i]-1))/(long)2;
                sum+=l1;
                y++;
            }
            
        }
        ans-=sum;
        if(sum>0)
        ans+=1;
        return ans;
        
    }
}