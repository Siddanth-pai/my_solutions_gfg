/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class GfG
{
	Node LCA(Node root, int n1,int n2)
	{
		// Your code here
	   if(root == null)
	      return new Node(-1);
	      
	   ArrayList<Node> pathB =new  ArrayList<>();  
	   ArrayList<Node> pathC = new ArrayList<>(); 
	      // ArrayList<Integer> pathToB = new ArrayList<>();
	      
		if((findPath(n1,root,pathC) == false) || (findPath(n2,root,pathB)==false))//using && gives pathB as empty set as when we get first as false then it wont evaluate the secong and will not calculate the the second expression...hence we use || as both will be evaluated reardless of the first expressionsp123456
               {
		     //System.out.println("i was here");
		     return new Node(-1);
		    
		}
		    // for( int i=0;i<pathB.size();i++)
		      //  System.out.println(pathB.get(i).data);
		        //for( int i=0;i<pathC.size();i++)
		        //System.out.println(pathC.get(i).data);
		    // System.out.println(pathC.data);//
		   // System.out.println(pathB);
	  if(pathB.isEmpty()  == true  ||  pathC.isEmpty()  == true){
	      return new Node(-1);}
	 // System.out.println("lol was here");
	       
		         
	   int i=0;
	 	for( i=0;i<pathB.size()&&i<pathC.size();i++){
	 	   // System.out.print(pathB.get(i).data+"lol");
	 	    //System.out.print(pathC.get(i).data+"ll");
	 	      if(pathB.get(i).data != pathC.get(i).data)
	 	 {
	 	  
	 	          break;
	 	 }
	 	     
	 	 }
		return pathB.get(i-1);      
		     
		     
	}	     
		     
		  
	boolean findPath(int  b,Node a,ArrayList path)
	{
	    if(a==null)
	      return false;
	      
	      
	    path.add(a);
	    
	    
	    if(b==a.data)
	       return true;
	  
	    if(findPath(b,a.left,path)==true)
	       return true;
	    
	    if(findPath(b,a.right,path)==true)
	      return true;
	    
	  path.remove(path.size()-1);
	  return false;
	        
	}
		  
		  
		  
	
}
