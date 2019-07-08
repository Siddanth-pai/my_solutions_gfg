/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/trapping-rain-water/0
https://www.geeksforgeeks.org/trapping-rain-water/
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
		    int s = scan.nextInt();
		   // int l = scan.nextInt();
		    int arr[] = new int[s];
		    for(int i = 0; i<s;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    equi(arr,s);
		    t--;
		   // System.out.println();
		}
	}
	static void equi(int arr[],int s)
	{
	    int l[] = new int[s];
	    int left[] = new int[s];
	    int r[] = new int[s];
	int count =0;
	int max = arr[0];
	for(int i=0;i<s;i++)
	{
	    if(i==0){
	        
	    l[i] = arr[0];//System.out.print(l[i]);
	    continue;
	     
	    }
	    l[i] = Math.max(l[i-1],arr[i]);
	   
	  // System.out.print(l[i]);
	    
	}
//	System.out.println();
	r[s-1]  = arr[s-1];
	for(int i=s-2;i>=0;i--)
	{
	    r[i] = Math.max(r[i+1],arr[i]);
	    // System.out.print(r[i]);
	}
	for(int i=0;i<s;i++)
	{
	    count = count +(Math.min(l[i],r[i])-arr[i]);
	}
	System.out.println(count);
	}
	
	
}
