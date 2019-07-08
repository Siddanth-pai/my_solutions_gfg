class GfG
{   
    Node lca(Node node, int n1, int n2) 
    {
        // Your code here
        Node temp = null;
        if(node == null)
           return null;
           if (node.data == n1 || node.data == n2)
               return node;
        while(node !=null)
        {
            if(n1 > node.data && n2 > node.data)
                node = node.right;
            else if(n1 < node.data && n2 < node.data)
            node = node.left;
            //else if(n1<node.data && node.data<n2)
             //{ temp = node;
            //System.out.println(node.data);
        //}
        else{break;
           // System.out.println("iam here");
        }
            
        }
                
          return node;
    }
    
}
