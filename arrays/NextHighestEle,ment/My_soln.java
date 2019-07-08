/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static int [] print_ans(int arr[],int n)
    {
        Stack<Integer> stck = new Stack<Integer>();
        int prr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            prr[i] = -1;
            while(stck.empty() !=true && arr[stck.peek()] < arr[i])
            {
            int id = stck.peek();
            stck.pop();
            prr[id] = i;
            }
        stck.push(i);
       }
       return prr;
    }
        
        
        
    
    
     
    
    
   // https://ide.geeksforgeeks.org/SirrnGVcjl
    
    
	public static void main (String[] args)throws IOException {
		//code
	//	GFG res = new GFG();
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine()); 
		while(test-->0){
		    //something wrong here
		  //  int size = Integer.parseInt(br.readLine());
		  //  int k=Integer.parseInt(br.readLine());
		    
		    //errors here
		    String[] integersInString = br.readLine().split(" ");
            int a[] = new int[integersInString.length];
            for (int i = 0; i < integersInString.length; i++) {
               a[i] = Integer.parseInt(integersInString[i]);
            }
            
            int size = a[0];
           // int k = a[1];
		      

		    //testing haha
		    int[] arr = new int[size];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+"); 
		    for(int i=0;i<size;i++){
		        arr[i]=Integer.parseInt(strs[i]); 
		      }
		   int res[]  =   print_ans(arr,size);
		   
		   for (int i =0; i < size; i++){
            if(res[i] != -1)
            System.out.print(arr[res[i]] + " ");
            else
            System.out.print("-1"+" ");
		   }
		   System.out.println();
	}
}
}




Output of Online Judge is:
14 3 4 4 7 7 7 14 14 -1
According to my understanding of questions output should be
14 3 4 4 6 7 7 14 14 -1

