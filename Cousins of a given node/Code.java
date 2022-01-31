class Solution
{
    public static ArrayList<Integer> printCousins(Node root, Node target)
    {
        ArrayList<Integer> cousins = new ArrayList<Integer>();
        if(root == null) {
            cousins.add(-1);
            return cousins;
        }
        
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        
        boolean cousinsFound = false;
        while(!q.isEmpty()) {
            
            int levelSize = q.size();
            boolean targetFound = false;
            
            while(levelSize-- > 0) {
                Node node = q.poll();
                
                if(cousinsFound) {
                    cousins.add(node.data);
                }
                
                if(node.left==target || node.right==target) {
                    targetFound = true;
                } else {
                    if(node.left != null) {
                        q.add(node.left);
                    }
                    if(node.right != null) {
                        q.add(node.right);
                    }
                }
            }
            cousinsFound = targetFound;
        }
        
        if(cousins.size() == 0) {
            cousins.add(-1);
        }
        return cousins;
    }
}
