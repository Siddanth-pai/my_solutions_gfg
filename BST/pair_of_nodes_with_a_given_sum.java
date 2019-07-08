//https://practice.geeksforgeeks.org/problems/find-a-pair-with-given-target-in-bst/1
class GfG
{
    
    public static boolean findPair(Node root, int target)
    {
       // your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
       inorder(list,root);
       //System.out.print(list);
       boolean i = pair(list,target);
     return i;
    }
    
    
    static void inorder(ArrayList<Integer> list,Node root)
    {
        if(root == null)
          return;
          
        
        inorder(list,root.left);
        list.add(root.data);
        inorder(list,root.right);
          
          
    }
    
    static boolean pair(ArrayList<Integer> list,int sum)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<=list.size()-1;i++){
            
            if(hm.containsKey(list.get(i)) == false)
              hm.put(list.get(i),0);
              
              
            hm.put(list.get(i),hm.get(list.get(i))+1);  
       //     System.out.print(list.get(i)+" ");
        }
        
      //  System.out.println(hm);
       int pair =0;
       for(int i=0;i<=hm.size()-1;i++)
       {
           if(hm.containsKey(sum - list.get(i)))
             pair =pair + hm.get(sum-list.get(i));
              
             // System.out.println(pair+" ;;"+list.get(i));
            if(sum-list.get(i) == list.get(i)){
              pair--;
              // System.out.print("loling");
            }
              
              
       }
       pair = pair /2;
    //return true  ; 
    //System.out.print(pair+" ;;");
    if(pair == 0)
    return false;
    else{
        return true;
    }
        
    }
    
    
    
}
