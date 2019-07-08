//https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1
class GfG
{
    Node flatten(Node root)
    {
	// Your code here
	ArrayList<Integer> arr = new ArrayList<Integer>();
	
	
	Node temp = root;

	
	while(temp!=null)
	{
	    
	    Node s = temp;
	   
	    while(s.bottom !=null){
	      arr.add(s.data);
	        s = s.bottom;
	       
	    }
	    arr.add(s.data);
	   
	    s.bottom = temp.next;//sexy thinking...........see it equates bottom to next(temp)......so that it can flatten it latter
	    
	    temp.next = null;
	    temp = s.bottom;
	   
	    
	}
	Node v = root;
	while(v!=null)
	{
	   
	    v.next = v.bottom;
	    v = v.next;
	}
	
		//System.out.print(arr);
	Collections.sort(arr);
	Node finalNode;
	int i=0;
	temp = root;//dude u get confused here ....yemp is returned............
	//System.out.print(arr.size()+"lol");
   while(root!= null)//this while flattens......previous we had equated all the last node in bottom to next node...now we flatten it
   {
       root.data = arr.get(i);
       //System.out.print(root.data+"lol");
       root = root.next;
       i++;
   }

//	System.out.print(arr);
	return temp;
    }
}


