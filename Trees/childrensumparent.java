//https://practice.geeksforgeeks.org/problems/children-sum-parent/1

class Node{
	int data;
	Node left,right;
	
	Node(int key)
	{
	    data = key;
	    left = right = null;
	}
}

class GfG
{
    public static int isSumProperty(Node node)
    {
        // add your code here
        
        if(node==null ||(node.left==null && node.right == null))
          return 1;
          int l=0;int r=0;
          if(node.left == null)
            l= 0;
            else
            l= node.left.data;
           if(node.right == null)
            r= 0;
            else
            r= node.right.data;
          if(node.data == l + r && isSumProperty(node.left)==1 &&isSumProperty(node.right)==1)
          {   
              
              return 1;
              
          }
         
          
        return 0;
        
        
    }
}
