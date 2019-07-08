/*

see if we get head1 == head2
then use it twice ...that is how this problem is....
1
16 14
12 23 28 43 44 59 60 68 70 85 88 92 124 125 136 168
13 20 32 35 61 95 98 98 118 125 150 194 220 227
Your Output is:
12 13 20 23 28 32 35 43 44 59 60 61 68 70 85 88 92 95 98 98 118 124 125 125 136 150 168 194 220 227 
*/


class gfg
{
    Node MergeLists(Node head1, Node head2) {
     
      Node nide =  new Node(0);  
       Node temp = nide;
      // System.out.println("bcs"+head1.data);
     //SinglyLinkedListNode temp =  new SinglyLinked; 
     if(head1 == null){
            return head2;
        }
else if(head2 == null){
            return head2;
        }
    else{    
         while(head1 != null  && head2 != null ){
             
             if(head1.data < head2.data){
                  //SinglyLinkedListNode node = new SinglyLinkedListNode(head1.data);
                  //temp.next= node;
                 //temp = temp.next;
                // System.out.print("lol"+head1.data);
                 temp.next=new Node(head1.data);
              head1 = head1.next;                    
             }
             else if(head1.data > head2.data){
            //      SinglyLinkedListNode node = new SinglyLinkedListNode(head2.data);
               //   temp.next= node;
                 //temp = temp.next;
                 //System.out.print("loling"+head2.data);
                 temp.next= new Node(head2.data);
              head2 = head2.next;                    
             }
        else{
            
            //SinglyLinkedListNode node = new SinglyLinkedListNode(head1.data);
            //      temp.next= node;
              //   temp = temp.next;
             // System.out.println("bcs"+head2.data);
                temp.next= new Node(head1.data);
                temp=temp.next;
                temp.next= new Node(head1.data);
              head2 = head2.next;    
            head1 = head1.next;
            
            
        }
         temp = temp.next;
         
         }
    }
        while(head1 != null )
        {  // System.out.println("lolon");
        Node node = new Node(head1.data);
                  temp.next= node;
                 temp = temp.next;
                 temp.next= null;
              head1 = head1.next;     
              //System.out.println("bcs");
    }

while(head2 != null )
{   //System.out.println("molon");
      Node node = new Node(head2.data);
                  temp.next= node;
                 temp = temp.next;
                 temp.next= null;
              head2 = head2.next;  
              
    }
        
        
        
            return nide.next;
    }
      
      

}
