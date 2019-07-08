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
	        // String str2=s.next();
	         
	        long_substr(str1);
	        
	       }
	}
	
     static void long_substr(String str)
     {
         
         HashMap<Character,Integer> hm = new HashMap<>();
         
        int maxlength =1;
         //String str1
         int len =0;
         for(int i=0;i<str.length();i++)
         {
          
          //str1 = str1 + str.charAt(i);
          char ele = str.charAt(i);
          if(hm.containsKey(ele) == false)
          {
              hm.put(ele,i);
              len++;
              if(len > maxlength)
               maxlength = len;
              
          }
          else{
              i = hm.get(ele);
              len=0;
              hm.clear();
          } 
             
         }
         
        System.out.print(maxlength+" ");
         System.out.println();
         
     }
	
	
	
	
}
