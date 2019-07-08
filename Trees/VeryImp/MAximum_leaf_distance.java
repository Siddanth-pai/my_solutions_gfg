//https://www.geeksforgeeks.org/find-maximum-path-sum-two-leaves-binary-tree/

class Res { 
	int val; 
} 
class GfG
{
    
    public static int maxPathSum(Node root)
    {
        Res res = new Res(); 
		res.val = Integer.MIN_VALUE; 
		maxPathSumUtil(root, res); 
		return res.val; 
    }
    
   static int maxPathSumUtil(Node node, Res res) { 

		// Base cases 
		if (node == null) 
			return 0; 
		if (node.left == null && node.right == null) 
			return node.data; 

		// Find maximum sum in left and right subtree. Also 
		// find maximum root to leaf sums in left and right 
		// subtrees and store them in ls and rs 
      //System.out.println("-+++++++++++++++++++++");
		int ls = maxPathSumUtil(node.left, res); 
      //System.out.println(ls+"ls");
		int rs = maxPathSumUtil(node.right, res); 
       //System.out.println(rs+"rs");
		// If both left and right children exist 
      //System.out.println("-------------------");
		if (node.left != null && node.right != null) { 

			// Update result if needed 
			res.val = Math.max(res.val, ls + rs + node.data); 

			// Return maxium possible value for root being 
			// on one side 
        //  System.out.println("i was here"+Math.max(ls, rs) + node.data+"lol"+(Math.max(ls, rs) + node.data));
			return Math.max(ls, rs) + node.data; 
		} 

		// If any of the two children is empty, return 
		// root sum for root being on one side 
		return (node.left == null) ? rs + node.data 
				: ls + node.data; 
	} 
   
}

