class Node
{
    int root;
    ArrayList<Integer> children = new ArrayList<>();
    
    Node(int root)
    {
        this.root = root;
    }
    
    public void addChild(int ch)
    {
        children.add(ch);
    }
    
}



class Solution {
    static int checkMirrorTree(int n, int e, int[] A, int[] B)
    {
        
        HashMap<Integer, Node> tree1 = new HashMap<>();
        
        for(int i=0; i<2*e-1; i+=2)
        {
            if(tree1.containsKey(A[i]))
            {
                tree1.get(A[i]).addChild(A[i+1]);
            }
            else
            {
                Node node = new Node(A[i]);
                node.addChild(A[i+1]);
                tree1.put(A[i], node);
                
            }
        }
        
        
        //Now for the second tree we start from the reverse direction:
        HashMap<Integer, Node> tree2 = new HashMap<>();
        
        for(int i=2*e-1; i>=1; i-=2)
        {
            if(tree2.containsKey(B[i-1]))
            {
                tree2.get(B[i-1]).addChild(B[i]);
            }
            else
            {
                Node node = new Node(B[i-1]);
                node.addChild(B[i]);
                tree2.put(B[i-1], node);
                
            }
        }
        
        
        for(Map.Entry<Integer, Node> es : tree1.entrySet())
        {
            int key = es.getKey();
            Node node1 = es.getValue();
            if(tree2.containsKey(key))
            {
                Node node2 = tree2.get(key);
                if(!node1.children.equals(node2.children))
                {
                    return 0;
                }
            }
            else
            {
                return 0;
            }
        }
        
        return 1;
    }
};