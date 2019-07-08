//https://practice.geeksforgeeks.org/problems/count-bst-nodes-that-lie-in-a-given-range/

//look when i used the same logic to check whether a given node is bst logic I could not solve it....hmmmm cant figure out why..try........
//for this i have used inorder trversal and hence instead of printing i am simply counting .. 
static int count=0;
public static int getCountOfNode(Node root,int l, int h)
{
    //Your code here
    
    if(root.left ==null && root.right == null)
        if(root.data>=l && root.data<=h)
          return 1;
    int ans = answer(root,l,h);
    count =0;//important if online judge checks it............
    return (ans);
}

 static int answer(Node root,int l,int h)
 {
     if(root!=null)
     {
         answer(root.left,l,h);
         if(root.data>=l && root.data <h){
           count++;
         //  System.out.println(root.data+" "+count);
         }
         answer(root.right,l,h);  
     }
     
    // return count;
     return count;
 }


