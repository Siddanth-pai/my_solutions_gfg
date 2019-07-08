//https://practice.geeksforgeeks.org/problems/level-order-traversal-in-spiral-form/1
void printSpiral(Node *root)
{
    if(!root)
    return;
    stack<int> s;
    int count=0;
    queue<Node*> q;
    q.push(root);
    q.push(NULL);
    while(!q.empty())
    {
        Node* temp=q.front();
        q.pop();
        if(temp==NULL)
        {   
            count++;
            while(!s.empty())
            {
                cout<<s.top()<<" ";
                s.pop();
            }
            if(q.empty())
            break;
            q.push(NULL);
            
        }
        else
        {   if(count%2==0)
            s.push(temp->data);
            else
            cout<<temp->data<<" ";
            if(temp->left)
            q.push(temp->left);
            if(temp->right)
            q.push(temp->right);
            
        }
    }
    
}
///////////////////////////////////////////////////////////////////
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class GfG
{
      void printSpiral(Node node) 
      {
           // Your code here
           String str="" ;
           String rstr="";
           Queue<Node> q = new LinkedList<>(); 
           q.add(node);
           q.add(null);
         int k=0;Stack<Node> stack = new Stack<Node>(); 
           while(q.isEmpty() ==false)
           {    Node i = q.remove();
               // k = height(i);
               // System.out.println(i.data+"data"+k);
              if(i ==null){
                 // str = str + i.data +" ";
                  //System.out.print(i.data+" ");
                  k++;
                   while(stack.isEmpty() == false){
                              System.out.print(stack.pop().data+" ");
                          }
                           if(q.isEmpty())
                           break;
                          q.add(null);
              }
               
              else{
                  //str = i.data +" "+ str;
                if(k % 2 == 0)
                {
                    stack.push(i);
                    
                }
                else{
                    System.out.print(i.data+" ");
                }
              
               
              if(i.left != null){
                  q.add(i.left);
              }
              if(i.right !=null){
                  q.add(i.right);
              }
              
           }
           
          //System.out.println(str);
      }
      
      }
      
}

