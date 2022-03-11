class Solution{
    static int findHeight(int n, int arr[]){
        int height = 1;
        int i=n-1;
        while(i>=0){
            i = arr[i];
            height++;
        }
        return --height;
    }
}