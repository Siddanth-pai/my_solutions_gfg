/*package whatever //do not write package name here */
//got it but failed
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t>0)
		{
		    int n = scan.nextInt() ;
		    int s = scan.nextInt() ;
		    int arr[] = new int[n];
		    for(int i = 0; i<n;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    findsum(arr,n,s);
		    t--;
		     System.out.println();
		}
		
	}
	
	
	static void findsum(int arr[],int n,int s)
	{
	    
	    
	    
	    for(int i=0;i<n;i++)
	       if(arr[i]==s){
	           
	         System.out.print((i+1) +" "+ (i+1));return ;
	       }
	       int sum=0;
	       for(int i=0;i<n;i++)
	       {   sum = arr[i];
	           for(int j=i+1;j<n;j++){
	              sum = sum +arr[j];
	               if(sum == s){
	                   System.out.print((i+1) +" "+ (j+1));return;
	                    //System.out.print("Yes ");return;
	               }
	           }
	           sum=0;
	       }
	       
	       System.out.print("-1 ");return;
	    
	    
	    
	    
	    
	    
	    
	}
	
	
	
}
