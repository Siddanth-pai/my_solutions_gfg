//some guy used this and it works...not ideal for concept but good to know in case thongs are not working
class GfG
{
    Node mergeKList(Node[]a,int N)
    {
     //Add your code here.
           MergeLL list=new MergeLL();
           ArrayList<Integer> l=new ArrayList<Integer>();
      for(int i=0;i<N;i++){
          Node temp=a[i];
          while(temp!=null){
             // list.addToTheLast(new Node(temp.data));
             l.add(temp.data);
              temp=temp.next;
          }
          
      }
      Collections.sort(l);
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<l.size();i++){
          sb.append(l.get(i)+" ");
      }
System.out.print(sb.toString());
     
     return null;
    }
}
