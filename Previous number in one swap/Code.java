class Solution{
    static String previousNumber(String S){
        StringBuilder s = new StringBuilder(S);
        int ind1 = -1;
        int n = S.length();
        for(int i=n-2;i>=0;i--){
            if(s.charAt(i)>s.charAt(i+1)){
                ind1 = i;
                break;
            }
        }
        if(ind1==-1) return new String("-1");
        
        int ind2 = -1;
        for(int i=ind1+1;i<n;i++){
            if(s.charAt(i)<s.charAt(ind1)){
                if(ind2 == -1){
                    ind2 = i;
                }else if(s.charAt(i)>s.charAt(ind2)){
                    ind2 = i;
                }
            }
        }
        
        char ch = s.charAt(ind1);
        s.setCharAt(ind1,s.charAt(ind2));
        s.setCharAt(ind2,ch);
        
        if(s.charAt(0)=='0') return new String("-1");
        return s.toString();
        
    }
}