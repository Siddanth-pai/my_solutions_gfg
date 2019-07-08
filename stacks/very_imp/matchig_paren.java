/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/longest-valid-parentheses/0
import java.util.*;
import java.lang.*;
import java.io.*;
//Longest valid Parentheses 
class GFG {
	public static void main (String[] args) {
		//code
		
		
			
		 Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0){
	         String str1=s.next();
	        
	         
	        long_parren(str1);
	        
	       }
	}
	
	static void long_parren(String str1)
	{
	    
	    Stack<Integer> stck = new Stack<Integer>();
	    int i=0;
	   char str[] = str1.toCharArray();
	    int max_len =0;
	    int len=0;
	   // stck.push('$');
	   while(i<str1.length())
	   {
	     if(str[i] == '(')
	     {   str[i] = '0';
	         stck.push(i);
	      //   i++;
	     }
	     
	     else if(stck.isEmpty() == false)
	     {
	         str[i]='1';
	         str[stck.peek()] = '1';
	         stck.pop();
	         //stck.pop();
	        // i++;
	     }
	     else{
	      str[i] = '0';   
	     }
	     i++;
	   }
	   //String ans = String.valueOf();
	   
	   //System.out.println(String.valueOf(str));
	   i=0;
	   while(i<str.length)
	   {
	      if(str[i]=='0')
            {
                if(max_len<len){
                    max_len=len;
                }
                len=0;
            }
            else{
                len++;}
	     i++;
	   }
	   
	           if(max_len < len )
	         { // System.out.println(len);
	             max_len =len;
	             len =0;
	         }
	 System.out.println(max_len);
	 max_len=0;
	// System.out.println("lolll");
	    
	}
	
	
}
