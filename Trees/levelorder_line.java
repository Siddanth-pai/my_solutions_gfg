//https://practice.geeksforgeeks.org/problems/level-order-traversal-line-by-line/1
class GfG
{
    void levelOrder(Node node) 
    {
        // Your code here
        
        Queue<Node> q = new LinkedList<>();
        Stack<Node> stck = new Stack<Node>();
        
        q.add(node);
        q.add(null);
        while(q.isEmpty() == false)
        {
            Node cur = q.remove();
            
            if(cur == null)
            {
            while(stck.isEmpty() == false)
            {
                System.out.print(stck.pop().data+" ");
            }
             System.out.print("$ ");
             if(q.isEmpty() ==true)////very important
                break;
             q.add(null);
           }
        else{
            stck.push(cur);
            if(cur.right != null)
               q.add(cur.right);//storing right so to print it easily
               if(cur.left != null)
               q.add(cur.left);   
        }
        } 
    }
}
