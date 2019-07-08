/*package whatever //do not write package name here */
//https://www.geeksforgeeks.org/trie-insert-and-search/
//
//https://practice.geeksforgeeks.org/problems/trie-insert-and-search/0
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
   static class trie{
       
   static int alpha = 25;
   trie children[] = new trie[26];
        boolean eof = false;
    trie(){
        for(int i=0;i<=25;i++)
          children[i] = null;
        
    }
   } 
      
    static trie root ;
	public static void main (String[] args) {
		//code
		
		
		
		
		
		 Scanner s = new Scanner(System.in);
	    int j=s.nextInt();
	    for(int i=0; i<j; i++){
	        
	        int len=s.nextInt();
	        root=new trie();
	        
	        while(len-->0){
	            insert(s.next());
	        }
	        
	        String f= s.next();
	        System.out.println(search(f)?1:0);
	}
}



  static void insert(String str)
  {
      trie pclass = root;
      
      int index = 0;
      for(int i=0;i<str.length();i++)
       {
           index = str.charAt(i) - 'a';
           if(pclass.children[index] == null  )
             pclass.children[index] = new trie();
       
       
       pclass = pclass.children[index];
  }
  pclass.eof = true;
}

static boolean search(String str)
{
      trie pclass = root;
      int index = 0;
      for(int i=0;i<str.length();i++)
        {
            
            index = str.charAt(i)-'a';
            if(pclass.children[index]==null)
            return false;
              //pclass.children[index] = new trie();
              
              
            pclass = pclass.children[index];  
        }
      
      return (pclass != null && pclass.eof == true );
}


}
