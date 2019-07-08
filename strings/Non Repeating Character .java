import java.util.*;
import java.lang.*;
import java.io.*;
//https://practice.geeksforgeeks.org/problems/non-repeating-character/0
class GFG {
	public static void main (String[] args) {
		//code
		
		
			 Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0){
	         int n=s.nextInt();
	         String str1=s.next();
	        // String str2=s.next();
	         
	         equ_str(str1,n);
	         System.out.println();
	      
	     }
	     
	}
	
static	void equ_str(String str1,int n)
	{
	    char str[]  = str1.toCharArray();
	    HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	    int flag=0;
	    for(int i=0;i<n;i++)
	    {
	        if(hm.containsKey(str[i]) == false)
	          hm.put(str[i],0);
	        hm.put(str[i],hm.get(str[i])+1);  
	    }
	    
	    for(int i=0;i<n;i++)
	    {
	        if(hm.get(str[i]) <=1)
	        {
	            
	            flag=1;
	            System.out.print(str[i]);
	            break;
	        }
	        
	    }
	    if(flag==0)
	    System.out.print("-1");
	}
	
	
}
