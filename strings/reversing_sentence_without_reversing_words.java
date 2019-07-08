import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
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
	    String astr = "";String str = "";
	    int i=0;
	  while(i < a.length())
	  {
	      
	      if(a.charAt(i) != '.')
	      {   
	         str = str + a.charAt(i);
	      }
	      else{
	          
	           str = '.' + str ;
	          astr = str + astr;
	           str = "";
	      }
	      
	      i++;
	      if(i==a.length())
	      {
	          
	          astr = str + astr;
	      }
	      
	  }
	
	System.out.println(astr);
	
	
}
    
    
}
