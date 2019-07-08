//https://practice.geeksforgeeks.org/problems/check-for-bst/1
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
    int isBST(Node root)  
    {
        // Your code here
        if(root == null || root.left==null && root.right==null)
           return 1;
        int max = 9999;int min = -9999;
        int i= isbst(root,min,max);
        return i;
        
    }
    
    int isbst(Node root,int min,int max)
    {
        if(root==null)
          return 1;
       if(root.data>=min && root.data <max)
       {
       if(((isbst(root.left,min,root.data))==1) &&((isbst(root.right,root.data,max))==1 )){
           //isbst(root.left,min,root.data);
          // isbst(root.right,root.data,max);
          return 1;
       }
           
       }
      
         //  System.out.println(min+" "+max+" "+root.data);
           return 0;
      
        //System.out.println(min+" "+max+" "+root.data);
      //  return 0;
    }
    
    
}
