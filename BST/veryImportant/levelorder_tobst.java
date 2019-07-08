Construct BST from its given level order traversal
//https://www.geeksforgeeks.org/construct-bst-given-level-order-traversal/


The idea is to use a queue to construct tree. Every element of queue has a structure say NodeDetails which stores details of a tree node. The details are pointer to the node, and two variables min and max where min stores the lower limit for the node values which can be a part of the left subtree and max stores the upper limit for the node values which can be a part of the right subtree for the specified node in NodeDetails structure variable. For the 1st array value arr[0], create a node and then create a NodeDetails structure having pointer to this node and min = INT_MIN and max = INT_MAX. Add this structure variable to a queue. This Node will be the root of the tree. Move to 2nd element in arr[] and then perform the following steps:

    Pop NodeDetails from the queue in temp.
    Check whether the current array element can be a left child of the node in temp with the help of min and temp.node data values. If it can, then create a new NodeDetails structure for this new array element value with its proper ‘min’ and ‘max’ values and push it to the queue, make this new node as the left child of temp’s node and move to next element in arr[].
    Check whether the current array element can be a right child of the node in temp with the help of max and temp.node data values. If it can, then create a new NodeDetails structure for this new array element value with its proper ‘min’ and ‘max’ values and push it to the queue, make this new node as the right child of temp’s node and move to next element in arr[].
    Repeat steps 1, 2 and 3 until there are no more elements in arr[].




class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}

class GFG {
    
    public Node constructBST(int[] arr){
        //Write your code here and return the root of the constructed BST
        
        Node root = new Node(arr[0]);
        
        
        
        
        NodeDetails nd = new NodeDetails();
        Queue<NodeDetails> q = new LinkedList<>();
        nd.node = root;
        nd.min = Integer.MIN_VALUE;
        nd.max = Integer.MAX_VALUE;
        
        q.add(nd);
        
        Node node = root;
        
        
        int index = 1;
        while(q.isEmpty() == false)
        {
            nd = q.remove(); 
            root = nd.node;
            
            if(index <arr.length && arr[index] < root.data && arr[index] > nd.min)
            {
                root.left = new Node(arr[index]);
                
             NodeDetails nd1 = new NodeDetails();
             nd1.node = root.left;
             nd1.min = nd.min;
             nd1.max = root.data;
             index++;
             q.add(nd1);
            }
            
            
            if(index <arr.length && arr[index] > root.data && arr[index] < nd.max)
            {
                root.right = new Node(arr[index]);
                
             NodeDetails nd1 = new NodeDetails();
             nd1.node = root.right;
             nd1.min = root.data;
             nd1.max = nd.max;
             index++;
             q.add(nd1);
            }
            
        }
            
         return node;   
            
        }
        
        

    
    

}




class NodeDetails
{
 int min,max; Node node;  
 
public NodeDetails()
{
    
}
 
    
}


