class GfG
{
    void levelOrder(Node node) 
    {
        // Your code here
        
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        
        while(q.size() !=0)
        {
            
            Node cur = q.remove();
            System.out.print(cur.data+" ");
            
            
            if(cur.left != null)
                q.add(cur.left);
            if(cur.right != null)
                q.add(cur.right);
        }
        
        
        
        
    }
}
