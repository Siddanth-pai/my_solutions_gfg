class GfG
{
	
        /* The method push to push element into the queue*/
        void push(int a,Queue_using_LinkedList ob)
	{
		//Your code
		if(ob.rear!= null && ob.front !=null){
		QueueNode node = new QueueNode();
		//while(ob)
		node.data = a;
		node.next = null;
		ob.rear.next = node;
		ob.rear = node;
		}
		else{
		    QueueNode node = new QueueNode();
		//while(ob)
	//ystem.out.print("pushedme");
		node.data = a;
		node.next = null;
		ob.rear = node;
		ob.front = node;
		}
	}
        
        /*The method pop which return the element poped out of the queue*/
	int pop(Queue_using_LinkedList ob)
	{
		
		// Your code
		int a =0;
		if(ob.front != null ){
		 a = ob.front.data;
	    ob.front = ob.front.next;
	  //System.out.print("poppedme");
	    return a;
		}
	else{
	  //System.out.print("popped-mep");
	    return -1;
	}
	}
}



/*

2
20
2 2 1 40 2 1 68 2 1 28 1 85 1 21 1 23 2 1 82 1 85 1 73 1 51 2 2 1 100 1 43 1 14 
9
1 43 1 97 2 1 12 1 16 2 1 33 1 51 2
Your Output is:
-1 -1 40 68 28 85 21 
43 97 12 

*/
