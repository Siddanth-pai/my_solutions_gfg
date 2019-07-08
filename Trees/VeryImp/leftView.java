//https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1
/*
Given a binary tree, print the values of nodes which would be present in
left view of binary tree. A node will be in the left-view if it is the
left-most node at its level (imagine level order traversal)
*/

class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class GfG
{
    void leftView(Node root)
    {
      // Your code here
      Queue<Node> q = new LinkedList<>();
      Stack<Node> stck = new Stack<Node>();
      q.add(root);
      q.add(null);
      
      while(q.isEmpty() == false)
       {
           Node cur = q.remove();
           if(cur == null)
           {
               while(stck.isEmpty() == false)
               {
                   Node r = stck.pop();
                   if(stck.isEmpty() == true)
                      System.out.print(r.data+" ");
               }
                if(q.isEmpty() == true )
                  break;
                  q.add(null);
              // while(stck.)
           }
           else{
               stck.push(cur);
            //continue;     
           
           
           if(cur.left !=null)
              q.add(cur.left);
              
            if(cur.right !=null)
              q.add(cur.right);
           }
       }   
           
           
           
       }
      
      
      
      
      
      
      
      
      
    
}
