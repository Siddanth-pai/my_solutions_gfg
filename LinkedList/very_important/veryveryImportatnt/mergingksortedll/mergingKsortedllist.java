//https://practice.geeksforgeeks.org/problems/merge-k-sorted-linked-lists/1
//dude revise this properly with an example as this will clear concept of linked list.....es
class GfG
{
    Node mergeKList(Node[]a,int N)
    {
     //Add your code here.
      int last=N-1;
       
       // Single list
       while(last!=0){
           
           int i=0,j=last;
           while(i<j){
               
               // Merge list i and list j and store in arr[i]
               a[i]=merge(a[i],a[j]);
               // Choose next pair
               i++;
               j--;
               // If mid list(i=j) or all pairs merged(i>j)
               if(i>=j){
                   last=j;
               }
               
           }
       }
      return a[0];
    
    }
    
    Node merge(Node head1,Node head2){// inplace merging...very cool
    
    if(head1==null){
        return head2;
    }
    else if(head2==null){
        return head1;
    }
    Node prev=null;
    Node ptr1=head1;
    Node ptr2=head2;
    Node newHead=null;
    
    
    while(ptr1!=null && ptr2!=null)
    {
        
        if(ptr1.data <= ptr2.data)
        {
            if(prev == null)
            {
                newHead = ptr1;
            }
            else{
                prev.next = ptr1;
            }
            
            prev = ptr1;
            ptr1 = ptr1.next;
        }
        else{
             if(prev == null)
            {
                newHead = ptr2;
            }
            else{
                prev.next = ptr2;
            }
            
            prev = ptr2;
            ptr2 = ptr2.next;
        }
        
    }
    
    while(ptr1!=null){
        prev.next=ptr1;
        prev=ptr1;
        ptr1=ptr1.next;
    }
    while(ptr2!=null){
        prev.next=ptr2;
        prev=ptr2;
        ptr2=ptr2.next;
    }
    return newHead;
    }
}
