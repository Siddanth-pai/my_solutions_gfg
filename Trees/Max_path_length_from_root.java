
//https://practice.geeksforgeeks.org/problems/maximum-path-sum/1
//use this
class Maximum{
        int max_num = Integer.MIN_VALUE;
    }
class GfG
{
    
    static Maximum max_num_ref = new Maximum();
    //max_num_ref.max_num = 0;
    public static int maxPathSum(Node root)
    {
        // your code here
        if (root == null) 
			return 0; 
        
         getmax(root,max_num_ref,0);
        return max_num_ref.max_num;
    }
    
   static int getmax(Node root,Maximum max_num,int cur) 
    {
        
        if (root == null) {
         // System.out.println(node);
			return -2 ;
			}
        
        cur  = cur +root.data;
        
        
        if(root.left ==null && root.right == null)
        {
            if(cur > max_num_ref.max_num)
            {
                 max_num_ref.max_num = cur;
            }
        }
        
        
        getmax(root.left,max_num_ref,cur);
        getmax(root.right,max_num_ref,cur);
        
        
        return -2 ;
        
        
    }
    
}
