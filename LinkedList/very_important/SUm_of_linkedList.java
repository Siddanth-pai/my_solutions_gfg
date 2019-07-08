//https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1
//I was making mistake in adding the rear part ...see this properly
class GfG
{
    
    void addnode(Node head3,Node last, int a )
	  {
	      Node newnode = new Node(a);
	    
        last = head3;  
        while (last.next != null) 
            last = last.next; 
  
       
        last.next = newnode;
        last = newnode;
	  }
	Node addTwoLists(Node first, Node second)
	{
	   
	   Node head1 = first;
	   Node head2 = second;
	  Node head3 = null;
	  Node last = head3;
	 
	  int carry =0;
	  int a =0;int b=0;int total =0;
	  while(head1 != null || head2 != null)
	  {
	      
	      if(head1 == null){
	          a = 0;
	      }
	       else{
	         a = head1.data;}
	       if(head2==null){
	           b=0;
	       }   
	       else{
	        b= head2.data;
	       }
	      if(carry == 0)
	        total = a +b ;
	       else{
	           total = a + b+1;
	       } 
	    
	      carry = total /10;
	      total = total % 10; 
	      if(head3 == null && last == null)
	      {
	          Node newnode = new Node(total);
	   
	      newnode.next =  null;
	      head3 = newnode;
	      }
	      else{
	      addnode(head3,last,total);
	    
	      }
	      if(head1 !=null)
	         head1 = head1.next;
	       if(head2 != null)
	         head2 = head2.next;
	      
	  }
	      
	   if(carry != 0 )
	   {
	       addnode(head3,last,carry);
	      
	   } 
	    return head3;  
	  }
	  
	  
	
}
