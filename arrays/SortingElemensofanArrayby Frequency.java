//https://practice.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency/0
//
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
		}
	}
	
	static void print_arr(int arr[],int s)
	{
	    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>(); 
	    Arrays.sort(arr);//if the frequency is same then this helps ascending order
	    for(int i=0;i<arr.length;i++)
	    {
	        if(hm.containsKey(arr[i])== false)
	        {
	             hm.put(arr[i],1);     
	        }
	        else{
	             hm.put(arr[i],hm.get(arr[i])+1);
	        }
	    }
	  
	while(!hm.isEmpty())
	{
	    int max = 0;
	    int maxval =0;
	     Set<Integer> keys = hm.keySet();

	    for(Integer key: keys){
	        int a =hm.get(key);
	      
	        if(a > maxval){
	            max = key;
	            maxval=a;
	          
	        }
	       }
	       
	     
	   for(int i=0;i<maxval;i++)
	   {
	      System.out.print(max+" ");
	   }
 	    
           hm.remove(max);
     
	}
	
	System.out.println();
	}
	
}
