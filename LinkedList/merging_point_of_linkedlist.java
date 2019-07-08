
//concept is simple just add every node of the list1 into a hashset    then iterate through list2 to find out whether the given node is present inthe (hashset)list or not 




class GFG
{
	int intersectPoint(Node headA, Node headB)
	{
       HashSet<Node> hs = new HashSet<Node>();
          if(headA == null || headB == null)
          {
              return -1;
          }
          
          while(headA!=null){
              hs.add(headA);
              headA = headA.next;
          }
          int flag=0;int data=-1;
          while(headB != null){
              if(hs.contains(headB))
              {   data = headB.data;
                  flag=1;
                  return data;
              }
              headB = headB.next;
          }
     return data;      
	}
}

