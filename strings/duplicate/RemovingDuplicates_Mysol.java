import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		//int testcases = sc.nextInt();
		Scanner s = new Scanner(System.in);
	    int T = s.nextInt();
	    s.nextLine();
	     for(int i=0; i<T; i++)
	     {
	         //int N;
	        // N = s.nextInt();
	         //S = s.nextInt();
	         //int A[] = new int[N];
	         
	         //for(int j=0; j<N; j++)
	           // A[j] = s.nextInt();
	           String a;
	           a  =  s.nextLine();
	          
	           dupli(a);
	     }
		
	}
	
	static void dupli(String a)
	{
	    //Dictionary dic  =  new Hashtable()
	   // Dictionary geek = new Hashtable();
	   HashMap<Character,Integer> geek=new HashMap<>();
	   for(int i=0;i<a.length();i++)
	   {
	       if(geek.isEmpty())
	       {
	           geek.put(a.charAt(i),1);
	       }
	       else{
	           if(geek.get(a.charAt(i)) == null)
	           {
	               geek.put(a.charAt(i),1);
	           }
	           else{
	               geek.put(a.charAt(i),geek.get(a.charAt(i))+1);
	           }
	       }
	   }
	   
	   for(int i=0;i<a.length();i++)
	   {
	       if(geek.containsKey(a.charAt(i)))
	       {
	           System.out.print(a.charAt(i));
	           geek.remove(a.charAt(i));
	       }
	      
	   }
	   
	     System.out.println();
	}
	
	  
	 
	
	
	
	
		
	
}
