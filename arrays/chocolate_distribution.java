/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/stock-buy-and-sell/0
//Stock buy and sell 
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
		    int n = scan.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0; i<n;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    	//int k = scan.nextInt();
		    stock(arr,n);
		    System.out.println();
		    t--;
		}
	}
	
	
	static void stock(int arr[],int n)
	{
	    
	    int s=0;
	    int e = 0;
	    int flag=0;int l=0;
	    for(int i=0;i<n-1;i++)
	    {
	        if(arr[i+1]-arr[i] >0)
	        {
	            if(flag ==0){
	                
	            
	            s=i;
	           flag=1     ;
	            }
	            l=i+1;
	        }
	        else{
	            if(flag==1){
	            flag=0;
	           // i++;
	            System.out.print("("+s+" "+l+") ");}
	        }
	    }
	    if(flag==1){
	            flag=0;
	           // i++;
	            System.out.print("("+s+" "+l+") ");}
	    if(s==l)
	    {
	        System.out.print("No Profit");
	    }
	    
	    
	    
	}
	
	
}
