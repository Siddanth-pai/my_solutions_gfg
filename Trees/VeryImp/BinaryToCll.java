class GfG
{ 
Node head;
    static Node prev = null;
    Node bTreeToClist(Node root)       //your code here
        {
         convert(root, null);
          head.left = prev;
          prev.right  = head;
          return head;
          
            }
    


void convert(Node root, Node headref) {
if (root == null)
return;
convert(root.left, headref);
if (head == null) {
head = root;
} else {
prev.right = root;
root.left = prev;
}
prev = root;
convert(root.right, headref);
}



    
}
    

