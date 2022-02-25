class Solution{
    public static String moveRobots(String s1, String s2){
        
        int i=0,j=0, n= s1.length();
        
        while(i<n && j<n)
        {
            while(i<n && s1.charAt(i) == '#') i++;
            while(j<n && s2.charAt(j) == '#')j++;
            
            if(i<n && j<n)
            {
                if(s1.charAt(i) != s2.charAt(j)) return "No";
                else if((s1.charAt(i) == 'A' && j>i) || (s2.charAt(j) == 'B' && j<i)) {
                   
                    return "No";
                }else{
                    i++;
                    j++;
                }
                
            }
            else break;
        }
        return (i ==n || j ==n )? "Yes":"No";
    }
}