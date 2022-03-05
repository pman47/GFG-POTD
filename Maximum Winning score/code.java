class Solution
{
    public static Long findMaxScore(Node root)
    {
        if(root == null) return (long)1;
        
        Long left = findMaxScore(root.left);
        Long right = findMaxScore(root.right);
        
        return Math.max((root.data*left),(root.data*right));
    }
}