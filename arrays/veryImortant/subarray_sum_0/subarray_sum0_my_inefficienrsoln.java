import java.util.*;
import java.lang.*;
import java.io.*;
//https://practice.geeksforgeeks.org/problems/subarray-with-0-sum/0
class GFG {
	public static void main (String[] args) {
		//code
			//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t>0)
		{
		    int n = scan.nextInt() ;
		    int arr[] = new int[n];
		    for(int i = 0; i<n;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    findsum(arr,n);
		    t--;
		     System.out.println();
		}
	}
	
	static void findsum(int arr[],int n)
	{
	    
	    for(int i=0;i<n;i++)
	       if(arr[i]==0){
	         System.out.print("Yes ");return ;
	       }
	       int sum=0;
	       for(int i=0;i<n;i++)
	       {   sum = arr[i];
	           for(int j=i+1;j<n;j++){
	              sum = sum +arr[j];
	               if(sum == 0){
	                    System.out.print("Yes ");return;
	               }
	           }
	           sum=0;
	       }
	       
	       System.out.print("No ");return;
	}
	
	
}
