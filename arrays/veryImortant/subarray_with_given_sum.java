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
	
	
	static void findsum(int arr[],int n,int sum)
	{
	    
	    int flag=0;
	    int lowIndex = 0;
		int highIndex = 0;
		int tempSum = 0;
	    
	        //if(tempSum < s || tempSum > s)
	        //{
	           int cur_sum = 0; 
		int start = 0; 
		int end = -1;
	    HashMap<Integer,Integer> hm = new HashMap<>();
	    
	   for(int i=0;i<n;i++)
	    {
	       cur_sum = cur_sum +arr[i];
	       
	       
	        if(cur_sum == sum)
	      {     start =0;
	           end = i;
	           break;
	      }
	      
	      
	      if (hm.containsKey(cur_sum - sum)) { 
				start = hm.get(cur_sum - sum) + 1; 
				end = i; 
				break; 
			} 
			//if value is not present then add to hashmap 
			hm.put(cur_sum, i); 

		} 
		// if end is -1 : means we have reached end without the sum 
		if (end == -1) { 
			System.out.print("-1"); 
		} else { 
			System.out.print((start+1) + " " + (end+1)); 
		} 
	      
	    }   
	      
	      
	      
	      
	    
	    
	    
	    
	       
	
	
	
}
