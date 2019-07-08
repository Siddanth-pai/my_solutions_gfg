//https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1

{
import java.util.*;
import java.lang.*;
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
class ReverseInSize
{
    static Node head;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }
            
            int k = sc.nextInt();
            GfG gfg = new GfG();
            Node res = gfg.reverse(head, k);
            printList(res);
            System.out.println();
        }
    }
    
    public static void addToTheLast(Node node)
    {
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
              temp = temp.next;
              temp.next = node;
        }
    }
    
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
}

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/
class GfG
{  static int i=1;
    //static 
    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node temp = null;Node newhead = null; Node element=null;
        Stack<Node> stck = new Stack<>();
        int i=1;
        
    while(node != null)
    {
        while(i <= k   && node!=null)
        {
            stck.push(node);
           
            node = node.next;
            // rem = node;
            
           // System.out.println(rem.data);
            i++;
        }
        //try{
        //Node begin = stck.pop();
        //Node head = begin;
        while(stck.empty() != true)
         {
        
             element = stck.pop();
            if(newhead == null)
            {
                newhead = element;
                temp  = element;
            }
            else{
                temp.next = element;
                temp = temp.next;
            }
             
             
             
        }
        i = 1;
     
        
    }
        //begin.next = rem;
        temp.next = null;
        return newhead;
        
        
        
    }
}
