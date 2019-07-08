//https://practice.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1

class Sum{
    int count;
}
class GfG
{
    int countLeaves(Node node) 
    {
         // Your code
         Sum s = new Sum();
          s.count = 0;
           getleaf(node,s);
        return s.count;
    }
    
    int getleaf(Node node,Sum s)
      {
          
          
           if(node == null)
            return 0;
            
        if(node.left == null && node.right == null)
           s.count = s.count + 1;
          
        getleaf(node.left,s);
        getleaf(node.right,s);
        return 0;
      }    
    
    
    
}

