class GfG{
    Node head = null;
    static Node prev = null;
Node BToDLL(Node root) {
    if(root == null){
        return null;
    }

    Node current = root;
    Node currentHead = null;
    while (current != null) {
        if(current.left == null) {
            if(head == null) {
                head = current;
                currentHead = head;
            }else {
                currentHead.right = current;
                current.left = currentHead;
                currentHead = current;
            }
            current = current.right;
            continue;
        }

        Node left = current.left;
        while (left.right != null && left.right != current) {
            left = left.right;
        }

        if(left.right == null) {
            left.right = current;
            current = current.left;
        }else {
            currentHead.right = current;
            current.left = currentHead;
            currentHead = current;

            current = current.right;
        }
    }
    return head;
}
}
