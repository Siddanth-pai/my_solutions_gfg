import java.util.*;
import java.lang.*;
import java.io.*;
//https://practice.geeksforgeeks.org/problems/longest-common-subsequence/0
//bro just type tushor roy or SWE for clarification............................
//https://practice.geeksforgeeks.org/problems/longest-common-subsequence/0
//
//
class GFG {
	public static void main (String[] args) {
		//code
		
		
		
		 Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0){
	         int len_str1=s.nextInt();
	         int len_str2=s.nextInt();
	         String str1=s.next();
	         String str2=s.next();
	         
	         dp_substr(str1,str2,len_str1,len_str2);
	        
	     }
	}
	
	
	static void dp_substr(String str1,String str2,int l1,int l2)
	{
	    
	    int l_tab[][] = new int[l1+1][l2+1];//look first row and column are zeroes
	    int result =0;
	    for(int i=0;i<=l1;i++)
	    {
	        
	        for(int j=0;j<=l2;j++)
	          {
	            if(i == 0 || j==0)
	            {
	                l_tab[i][j] = 0;
	            }
	            else if(str1.charAt(i-1)==str2.charAt(j-1))
	            {
	                l_tab[i][j] = l_tab[i-1][j-1] + 1;
	                
	            }
	            else{
	                l_tab[i][j] = Math.max(l_tab[i-1][j],l_tab[i][j-1]);
	            }
	         }
	    }
	   
	   // System.out.println(str);
	    System.out.println(l_tab[l1][l2]);
	    
	    
	    
	    
	}
	
	
	
	
}
