/*
For Input:
1
3
1 3 4
2
Your Output is:
4
lolz
4
3
1
3
True
*/

class GfG
{
 int detectLoop(Node head)
  {
   // Add code here
    int flag =0;int f=0;
      Node temp = null;
      HashSet<Node> hsk = new HashSet<>();
      //hsk.add(head);
      while(head.next !=null)
      {   flag =1;
          
          if(hsk.contains(head)){
              f =1;
             // System.out.println(head.next.data);
              break;
          }
          else{
              hsk.add(head);
          }
          head = head.next;
      }
      
      if(f==1 && flag ==1){
          return 1;
      }
      else{
          return 0;
      }
      
      
  } 
      
    }

