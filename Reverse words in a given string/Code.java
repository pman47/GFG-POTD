class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        ArrayList<String> ArrayString = new ArrayList<String>();
        String temp = "";
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='.'){
                ArrayString.add(temp);
                temp="";
            }else{
                temp+=S.charAt(i);
            }
        }
        
        ArrayString.add(temp);
        
        String ans = "";
        for(int i=ArrayString.size()-1;i>=0;i--){
            ans+=ArrayString.get(i);
            if(i!=0) ans+='.';
        }
        
        return ans;
    }
}