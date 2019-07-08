/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}
This is method only submission.  You only need to complete the method. */

//https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
class GFG
{
    // Function to find middle element a linked list
    int getMiddle(Node head)
   {
         // Your code here.
         
         Node temp = head;
         int c=1;
         
         while(temp.next!=null)
         {
             c++;
             temp = temp.next;
             
             
         }
       // System.out.println(c);
        if(c==2)
        {
            return head.next.data;
        }
        if(c % 2 == 0)
        {    c  = c / 2;
             int i=1;
            while(head.next!=null)
         {
             if(i == (c+1)){
                 return head.data;
             }
             head = head.next;
             i++;
             
         }
        }
            else{
               c = (c+1) /2;
               int j=1;
                 while(head.next!=null)
         {    
             if(j == c){
                 return head.data;
             }
             j++;
             head = head.next;
             
             
         }
            }         
        
        return 0;
        //return head.data;
   }
}
