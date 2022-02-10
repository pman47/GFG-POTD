class Solution{
    static int xorCal(int k){
        if(k==1) return 2;
        else if(k==3 || k==7 || k==15 || k==31 || k==63) return k/2;
        return -1;
    }
}