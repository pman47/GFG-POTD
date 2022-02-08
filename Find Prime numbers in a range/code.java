class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i=M;i<=N;i++){
            if(isPrime(i)) primes.add(i);
        }
        return primes;
    }
    
    static boolean isPrime(int x){
        if(x<=1) return false;
        for(int i=2;i*i<=x;i++){
            if(x%i==0) return false;
        }
        return true;
    }
    
}