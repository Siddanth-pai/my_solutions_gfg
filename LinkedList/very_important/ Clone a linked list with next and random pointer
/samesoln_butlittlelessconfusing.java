Algorithm
1.Create a Map and Traverse the original list and every traversal store address of current node as key and arbitrary value as value.
2.Again traverse the original list and every traversal create a new node and get the value from map of current node and make it arbitrary value.
3.do this till null and finaly return the head of new List.

class GfG
{
Node copyList(Node head)
{
Node temp,curr=head,newNode,x=null;
temp=head;
HashMap<node,node>hm=new HashMap<node,node>();
while(temp!=null)
{
hm.put(temp,temp.arb);
temp=temp.next;
}
temp=head;
curr=new Node(head.data);
curr.arb=hm.get(head);
temp=temp.next;
x=curr;
while(temp!=null)
{
newNode=new Node(temp.data);
newNode.arb=hm.get(temp);
x.next=newNode;
x=x.next;
temp=temp.next;

}
return curr;

}
}
