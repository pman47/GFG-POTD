class Solution{
    
    int swapBits(int x, int p1, int p2, int n)
    {
        String s=Integer.toBinaryString(x);
        
       
        while(s.length()<16)
        {
            s="0"+s;
        }
        // System.out.println(s);
        char ch[]=s.toCharArray();
        int size=s.length()-1;
        while(n-->0)
        {
            char temp=ch[size-p2];
            ch[size-p2]=ch[size-p1];
            ch[size-p1]=temp;
            p1++;
            p2++;
        }
        
        String ans=String.valueOf(ch);
        // System.out.println(ans);
        
        return Integer.parseInt(ans,2);
    }
}