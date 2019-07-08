//https://practice.geeksforgeeks.org/problems/insert-a-node-in-a-bst/1

class GfG
{
   /* This function should insert a new node with given data and
      return root of the modified tree  */
    Node insert(Node root, int data)
    {
         // Your code here
        // while(root !=null)
         
        if(root == null){
           // System.out.print("lol");
           Node cur = new Node(data);
         root = cur;
         return root;
        } 
        
        Node prev = null;
        Node cur = root;
        while(cur!=null)
        {
            prev = cur;
            if(cur.data < data)
              {
                  cur = cur.right;
              }
            
            else if(cur.data > data){
                cur = cur.left;
            }
            else{
                return root;
            }
            
        }
        
        if(prev.data <data)
        {
            prev.right = new Node(data);
        
        }
        else{
            prev.left = new Node(data);
        }
        return root;
    }
}
