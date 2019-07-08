*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class GfG
{
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Node element = null;Node newhead = null;Node rem = null;
        Stack<Node> stck = new Stack<>();
        Node temp = head;
        while(temp!=null)
        {
            stck.push(temp);
            if(temp.next == null){
                break;
            }
            temp = temp.next; 
           // head = head.next;
            //System.out.print(head.data);
        }
       // System.out.print(head.next.data);
       // stck.pop();
        //System.out.println(stck.peek().data);
        int flag=0;
         while(stck.empty() != true)
        {
            element = stck.pop();
            //System.out.println(element.data);
            if(head.data != element.data){
                flag = 1;
                break;
            }
            head = head.next;
        }
        
        
        /*while(stck.empty() != true)
        {
            element = stck.pop();
            if(newhead == null)
            {
                newhead = element;
                rem = element;
            }
            else{
                rem.next = element;
                rem = rem.next;
            }
        }
         //System.out.print(head.next.next.data);
       
         
        rem.next = null;
        int flag=0;
        //System.out.print(head.next.data);
        while(newhead!=null && head!=null)
        {
            //System.out.print(head.data);
           // if(newhead.data != head.data){
             //   flag=1;
                //break;
            //}
            //newhead=newhead.next;
            head = head.next;
        }*/
        if(flag==0)
          return true;
        else{
             return false;
        }  
        
    }    
}
