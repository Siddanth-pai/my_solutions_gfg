//https://practice.geeksforgeeks.org/problems/normal-bst-to-balanced-bst/1
//see previous bstToavl for logic.......common even gfg has a solution .....even link is there in that doc 

class Node
{
    int data;
    Node right, left;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class GfG
{
    Node buildBalancedTree(Node root) 
    {
        //Add your code here.
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        buildarray(root,arr);
        
        Node head = buildarrayutil(arr,0,arr.size()-1);
       //System.out.println(arr);
        return head;
    }
    
    void buildarray(Node root,ArrayList<Integer> arr)
    {
        
        if(root==null)
          return ;
          
          buildarray(root.left,arr);
          arr.add(root.data);
         // System.out.print(root.data);
          buildarray(root.right,arr);
          
          
        
    }
    
    Node buildarrayutil(ArrayList<Integer> arr,int min,int max)
    {
        
        if(min >max)
          return null;
          
         //int mid = (arr.get(min) + arr.get(max)) /2;
        int  mid = (min +max)/2;
         
         Node root = new Node(arr.get(mid));
         
         
         root.left = buildarrayutil(arr,min,mid-1);
         root.right = buildarrayutil(arr,mid+1,max);
         
         
         
         
         return root;
         
         
         
          
        
    }
    
    
    
    
}

