/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem/0
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
		    	int k = scan.nextInt();
		    equi(arr,n,k);
		    t--;
		}
	}
	
	static void  equi(int arr[],int n,int k)
	{
	    
	    //System.out.println(k);
	    Arrays.sort(arr);
	    //System.out.println(n);
	    if(k==1){
	     System.out.println("0");
	        return;
	    }
	    int min_len =0;int len =0;
	    for(int i=0;(i+k-1)<n;i++)
	    {
	        if(i==0 && k-1<n) 
	        {
	            min_len = arr[k-1] - arr[0];
	        }
	        
	        len = arr[i+k-1] - arr[i];
	        if(len < min_len)
	        {  //System.out.print(arr[i]);
	           //System.out.print(arr[i+k-1]);
	            min_len = len;
	            len=0;
	        }
	        
	        
	    }
	    System.out.println(min_len);
	}
	
	
	
}
