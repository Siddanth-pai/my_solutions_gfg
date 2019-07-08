/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k/0
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
		    int l = scan.nextInt();
		    int arr[] = new int[s];
		    for(int i = 0; i<s;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    equi(arr,l);
		    t--;
		    System.out.println();
		}
	}
	
	
	static void equi(int arr[],int k)
	{
	    
	   int i=0;int max=arr[i];
	    ArrayList<Integer> ar = new ArrayList<>();
	   for(i=0;i+k<arr.length;i++){ 
	    
	   int l = k+i;
	   int m = i;
	    max=arr[i];
	    while(m <l)
	    {
	        if(max < arr[m]){
	          max = arr[m];
	        //  i++;
	        }
	        m++;
	    }
	    //i--;
	    ar.add(max);
	    //j++;
	    
	    
	   }
	    
	    max = arr[i];
	    for(;i<arr.length;i++)
	    {
	        if(max < arr[i])
	          max = arr[i];
	    }
	    ar.add(max);
	    //System.out.println(ar+"lol");
	    for(i=0;i<ar.size();i++)
	    {
	        System.out.print(ar.get(i)+" ");
	    }
	}
	
	
}
