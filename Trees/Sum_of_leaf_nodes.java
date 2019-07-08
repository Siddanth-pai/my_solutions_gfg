//https://practice.geeksforgeeks.org/problems/sum-of-leaf-nodes/1




class GfG
{
    class Res
    {
        int sum = 0;
    }
    public int SumofLeafNodes(Node root)
    {
        Res r = new Res();
        leafSum(root, r);
        return r.sum;
    }
    
   public int leafSum(Node root,Res r)
   {
       if(root == null)
          return 0;
          
       if(root.left == null && root.right == null){
           r.sum = r.sum + root.data;
          // System.out.println(root.data);
       }
        leafSum(root.left,r);
        leafSum(root.right,r);
        return 0;
        
        }
          
          
          
   
}
