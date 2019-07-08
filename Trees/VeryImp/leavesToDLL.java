https://practice.geeksforgeeks.org/problems/leaves-to-dll/1
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

class GfG
{  static Node prev ;
Node head;
    Node convertToDLL(Node root)
    {
        //your code here
        convert(root);
       // System.out.print("lol");
        return head;
    }
    
    void convert(Node root)
    {
        if(root==null)
           return ;
           
           
           
         convert(root.left);  
        if(root.left == null && root.right == null)//to identify the leaves nodes
           {   
                   if(head==null)
                        {
                  head = root;
                  prev = root;
                       }
                  else{
             
                    prev.right = root;
                    root.left = prev;
                    prev = root;
                     }
                
         } 
           
        convert(root.right);
        
    }
     public void pritntDLL()
{
Node n = head ;//head being head of the Dlinkedlist
Node temp = null;
while(n!=null)
{
System.out.print(n.data+" ");
temp = n;
n = n.right;
}
System.out.println();
while(temp !=null)
{
System.out.print(temp.data+" ");
temp = temp.left;
}
}
   
}

