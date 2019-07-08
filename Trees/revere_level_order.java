//https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1/?ref=self
class GfG
{
	void reversePrint(Node node) 
        {
            // your code here
              Queue<Node> q = new LinkedList<>();
        Stack<Node> stck = new Stack<Node>();
        
        q.add(node);
       // q.add(null);
        while(q.isEmpty() == false)
        {
            Node cur = q.remove();
             //if(q.isEmpty() ==true)//very important
              //  break;
            // q.add(null);
            stck.push(cur);
            if(cur.right != null)
               q.add(cur.right);
               if(cur.left != null)
               q.add(cur.left);   
        
        } 
        while(stck.isEmpty() == false)
        System.out.print(stck.pop().data+" ");
        }
        
}      
       

