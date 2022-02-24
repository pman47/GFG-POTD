class Solution{
    static List<Integer> primeDivision(int N){
        List<Integer> a = new ArrayList<Integer>();
        for(int i=1;i<N;i++){
            if(isPrime(i) && isPrime(N-i)){
                a.add(i);
                a.add(N-i);
                return a;
            }
        }
        return a;
    }
    
    static boolean isPrime(int n){
        if (n <= 1)
            return false;
 
        else if (n == 2)
            return true;
            
        else if (n % 2 == 0)
            return false;
 
        for (int i = 3; i*i <= n; i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}