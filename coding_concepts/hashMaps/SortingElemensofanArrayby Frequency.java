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
	    Arrays.sort(arr);
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
	   // Set<Integer> keys = hm.keySet();
	   // System.out.println(hm+" ");
	/*    for(Integer key: keys){
	       int a =hm.get(key);
	      // System.out.println();
	       //System.out.println(a+"lol ");
	        for(int i=0;i<a;i++)
	        {
	            System.out.print(key+" ");
	        }
	    }
	
	*/ 
 	//System.out.print(hm);
	while(!hm.isEmpty())
	{
	    int max = 0;
	    int maxval =0;
	     Set<Integer> keys = hm.keySet();
//	     System.out.print(keys);
	    for(Integer key: keys){
	        int a =hm.get(key);
	        //System.out.print(a+"ll ");
	        if(a > maxval){
	            max = key;
	            maxval=a;
	            //System.out.print(max+" ");
	        }
	       }
	       //System.out.println(hm+"ll ");
	      // System.out.print(max+"l");
	   for(int i=0;i<maxval;i++)
	   {
	      System.out.print(max+" ");
	   }
 	     //System.out.print(max+"ll ");
           hm.remove(max);
      //System.out.print(hm);
           //System.out.println(hm+"ll ");
	}
	//System.out.print(hm);
	//System.out.println("ll ");
	System.out.println();
	}
	//System.out.println("ll");
}
