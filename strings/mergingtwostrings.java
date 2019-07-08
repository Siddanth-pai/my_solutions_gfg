/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		 Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0){
	         String str1=s.next();
	         String str2=s.next();
	         
	        long_pallin(str1,str2);
	        
	       }
	}
	
	
	static void long_pallin(String str1,String str2)
	{
	    int i=0 ;int j=0;int k=0;
	    String str3="";
	    while(j<str1.length() && k<str2.length())
	    {
	        if(i % 2==0)
	        {
	            str3 = str3 + str1.charAt(j);
	            i++;
	            j++;
	        }
	        else{
	            str3 = str3 + str2.charAt(k);
	            i++;
	            k++;
	        }
	        
	    }
	    
	    if(j < str1.length())
	    {
	        str3 = str3 + str1.substring(j,str1.length());
	    }
	    
	     if(k < str2.length())
	    {
	        str3 = str3 + str2.substring(k,str2.length());
	    }
	    
	   System.out.print(str3); 
	   System.out.println();
	}
	
}
