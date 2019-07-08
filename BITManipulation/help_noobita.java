import java.util.*;
import java.lang.*;
import java.io.*;
//https://towardsdatascience.com/how-did-we-build-book-recommender-systems-in-an-hour-part-2-k-nearest-neighbors-and-matrix-c04b3c2ef55c
class GFG {
	public static void main (String[] args) {
		//code\
		
		
		
		 Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0){
	         String str1=s.next();
	        // String str2=s.next();
	         
	        nobita(str1);
	       
	     }
	}
	
	
	static void nobita(String s)
	{
	    char str[] = s.toCharArray();
	    
	    
	    HashMap<Character,Integer> hm = new HashMap<>();
	    
	    
	    for(int i=0;i<str.length;i++)
	    {
	        if(hm.containsKey(str[i])==false)
	           hm.put(str[i],0);
	       hm.put(str[i],hm.get(str[i])+1);    
       }
	    int x,y;
	    x=y=0;
	   //System.out.print('b'&1);
	    Set<Character> keys = hm.keySet();
		for(Character key: keys){
			if(((key & 1 )==1)&& ((hm.get(key)&1)==1))
			{
			   // y = y+ hm.get(key);
			   y=y+1;
			}
			else if((((key & 1 )!=1)&& ((hm.get(key)&1)!=1)))
			{
			    //x = x+ hm.get(key);
			    x=x+1;
			}
		}
	//	System.out.println(y);
	//	System.out.println(x);
	  int l=x+y;
	  if(l%2==0)
	  {
	      System.out.println("EVEN");
	  }
	  else{
	      System.out.println("ODD");
	  }
		
		
		
	}
	
	
	
}
