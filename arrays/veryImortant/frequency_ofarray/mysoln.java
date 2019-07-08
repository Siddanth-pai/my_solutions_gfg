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
		    int arr[] = new int[s];
		    for(int i = 0; i<s;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    print_arr(arr,s);
		    t--;
		    System.out.println();
		}
		
	}
	
	static void print_arr(int arr[],int s)
	{
	    HashMap<Integer,Integer> hm = new HashMap<>();
	    
	    
	    for(int i=0;i<s;i++)
	    {
	        if(hm.containsKey(arr[i])!=false)
	        {
	            hm.put(arr[i],hm.get(arr[i])+1);
	        }
	        
	        else{
	            hm.put(arr[i],1);
	        }
	    }
	    
	    
	    
	   // System.out.println(hm);
	    for(int i=1;i<=s;i++)
	    {
	        if(hm.containsKey(i))
	          System.out.print(hm.get(i)+" ");
	          
	        else{
	            System.out.print("0"+" ");
	        }  
	    }
	    
	    
	    
	    
	    
	    
	}
	
	
	
	
}
