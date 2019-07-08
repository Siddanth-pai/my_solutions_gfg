class GfG{
void rightView(TreeNode node) {
//add code here.

             Queue<TreeNode> q = new LinkedList<>();
             Stack<TreeNode> stck = new Stack<TreeNode>();
             q.add(node);
             q.add(null);
             while(q.isEmpty() == false)
              {
                  
                  TreeNode cur = q.remove();
                 
                if(cur == null)
                 {
                    if(stck.isEmpty() == false)
                    {
                        System.out.print(stck.peek().data+" ");
                    }
                    while(stck.isEmpty() == false)
                    {
                        stck.pop();
                    }
                    if(q.isEmpty())
                       break;
                       
                      q.add(null); 
                    
                    
                 }
                  else{
                      
                     stck.push(cur);
                     
                     if(cur.left != null)
                         q.add(cur.left);
                    if(cur.right != null)
                         q.add(cur.right);     
                  }
                  
                  
                  
                  
                  
              }
             
             
             
             
             
             






}
}
