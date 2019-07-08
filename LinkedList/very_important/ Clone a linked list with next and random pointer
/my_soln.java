//https://practice.geeksforgeeks.org/problems/clone-a-linked-list-with-next-and-random-pointer/1
Algorithm
1.Create a Map and Traverse the original list and every traversal store address of current node as key and arbitrary value as value.
2.Again traverse the original list and every traversal create a new node and get the value from map of current node and make it arbitrary value.
3.do this till null and finaly return the head of new List.
class GfG
{
    Node copyList(Node head)
    {
        //your code here
      HashMap<Node,Node> hm = new HashMap<Node,Node>();
      
      
      Node temp = head;
      Node temp1 = head;
      while(temp!=null)
      {
          hm.put(temp,temp.arb);
          temp = temp.next;
      }
     // System.out.print(hm);
     
   Node NewHead = new Node(temp1.data);
    NewHead.arb = hm.get(temp1);
   Node NewNewHead = NewHead;
   temp1 = temp1.next;
   while(temp1!=null){
       
       NewHead.next = new Node(temp1.data);
       if(hm.get(temp1)!=null)
         NewHead.next.arb = hm.get(temp1);
        else{
            NewHead.next.arb = null;
        } 
       temp1=temp1.next;
       NewHead = NewHead.next;
   }
     
      return NewNewHead;
}


    
}

