class GfG
{
	public void rotate(Node head,int k)
        {
         //add code here.
         Node temp = head;
         
         while(temp.next != null){
             temp = temp.next;
         }
         
         temp.next = head;
         temp = temp.next;
        Node prev = null;
        // System.out.print(temp.next.data);
         int i=1;
         while(temp.next !=null)
         {//System.out.print(temp.data);
             if(i==k)
             {   prev =temp;
                 head = temp.next;
                 //temp= temp.next;
                 temp.next = null;
                // System.out.print(temp.data);
                 break;
             }
             temp = temp.next;
             i++;
         }
         //System.out.print(head.data);
         while(head !=null)
         {
             System.out.print(head.data);
             System.out.print(" ");
             
             head = head.next;
         }
         //System.out.print(prev.data);
         //System.out.println();
         }
}
