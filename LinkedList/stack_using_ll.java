/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
The structure of the node of the stack is
class StackNode
{
	int data;
	StackNode next;
}
class Stack_using_LinkedList
{
	 StackNode top;
}
*/
// This is method only submission
class GfG
{
	/* The method push to push element into the stack */
        void push(int a,Stack_using_LinkedList ob)
	{
		 //Your code here
	/*	StackNode new_node = new StackNode();
		new_node.data = a;
		new_node.next = ob.top;
		ob.top = new_node;
          //ob.top.data=a;
          */
          if(ob.top == null){
              StackNode new_node = new StackNode();
              new_node.data = a;
              new_node.next = null;
              ob.top = new_node;
              //System.out.println(ob.top.data);
          }
          else{
              StackNode new_node = new StackNode();
              new_node.data = a;
              new_node.next = ob.top;
              ob.top = new_node;
          }
          //System.out.println("bum");
	}
        /*The method pop which return the element poped out of the stack*/
	int pop(Stack_using_LinkedList ob)
	{
		//Your code here
		 int a=-1; 
		if(ob.top != null)
		  {  a = ob.top.data;
		    ob.top = ob.top.next;
		  }
		  return a;
	}
	
}
/*
2
20
2 2 1 40 2 1 68 2 1 28 1 85 1 21 1 23 2 1 82 1 85 1 73 1 51 2 2 1 100 1 43 1 14 
9
1 43 1 97 2 1 12 1 16 2 1 33 1 51 2
Your Output is:
-1 -1 40 68 23 51 73 
97 16 51 

*/
