// this is called floyd algo for detecting cycle
class GfG
{
int detectLoop(Node head)
{
Node slow=head;
Node fast=head;
int flag=0;
while(slow!=null&&fast!=null&&fast.next!=null)
{

slow=slow.next;
fast=fast.next.next;
if(slow==fast)
{
flag++;
break;
}
}
return flag;
}
}
