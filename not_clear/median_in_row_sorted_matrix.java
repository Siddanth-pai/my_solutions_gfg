Algorithm:

    First we find the minimum and maximum elements in the matrix. Minimum element can be easily found by comparing the first element of each row, and similarly the maximum element can be found by comparing the last element of each row.
    Then we use binary search on our range of numbers from minimum to maximum, we find the mid of the min and max, and get count of numbers less than our mid. And accordingly change the min or max.
    For a number to be median, there should be (r*c)/2 numbers smaller than that number. So for every number, we get the count of numbers less than that by using upper_bound() in each row of matrix, if it is less than the required count, the median must be greater than the selected number, else the median must be less than or equal to the selected number

//https://www.geeksforgeeks.org/find-median-row-wise-sorted-matrix/
//https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix/0





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
		     int m = scan.nextInt();
		    int arr[][] = new int[n][m];
		    for(int i = 0; i<n;i++)
		    {
		         for(int j = 0; j<m;j++)
		    {
		        arr[i][j] = scan.nextInt();
		    }
		    }//	int k = scan.nextInt();
		    median(arr,n,m);
		    t--;
		}
	}
	
	static void median(int arr[][],int n,int m)
	{
	    int max = Integer.MIN_VALUE; 
		int min = Integer.MAX_VALUE;
		
		
		for(int i=0;i<n;i++)
		{
		    
		    if(min > arr[i][0])
		     min = arr[i][0];
		     
		    if(max < arr[i][m-1])
		     max = arr[i][m-1];
		}
	    
	    int desired = ((m *n) + 1)/2;
	    
	    while(min < max)
	    {
	        
	        
	        int place = 0;
	        int mid = min + (max-min)/2;
	        int get =0;
	        
	        for(int i=0;i<n;++i )
	        {
	            
	            get = Arrays.binarySearch(arr[i],mid);
	            
	            if(get <0)
	             get = Math.abs(get) -1;
	             
	             
	             
	             
	            while(get < arr[i].length && mid ==arr[i][get] ) 
	            get = get +1;
	            
	            
	            place = place +get;
	            
	        }
	        
	  if(place < desired)
	    min = mid +1;
	   else{
	   max = mid;
	   } 
	        
	        
	        
	        
	    }
	    
	    System.out.println(min);
	    
	}
	
	
}
