import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
	Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int i=0;i<tc;i++)
		{  
		    int size = sc.nextInt();
		   int arr[] = new int[size];
		   	for(int j=0;j<size;j++)
		{
		    arr[j] = sc.nextInt();
		    arr[j] = arr[j] * arr[j];
		
		}
		Arrays.sort(arr);
		pytho(arr,size);
		  
	}
	}
	
	static int pytho(int arr[],int size)
	{
	     HashSet<Integer> h = new HashSet<Integer>();
	    int l,r;
	    for(int j=0;j<size;j++)
	    {
	        h.add(arr[j]);
	    }
	    l=0;r=0;
	   int sum = 0;
	   int count =0;
	    /*while(l<r )
	    {    
	        if(h.contains(sum)){
	            System.out.println(sum);
	        System.out.println("Yes");
	        break;
	         }
	        
	       else if(sum > arr[size-1])
	       {  sum = sum - arr[l];
	           l++;
	       }
	       	       else{
	       	           if(count==0)
	       	           {
	       	            r++;
	       	            sum = arr[l] + arr[r];
	                    count=1;    
	                    }
	                else{
	                    sum =sum -arr[r];
	                       r++;
	       	            sum = arr[l] + arr[r];
	                       }
	                       System.out.println(sum);
	       	       }
	       	       //System.out.println(sum);
	        	}
	        	return 0;
	}
	
}*/
int flag =0;

       for(int i=0;i<size-1;i++)
       {
           for(int j=i+1;j<size;j++)
           {
               sum =arr[i]  + arr[j];
               if(h.contains(sum))
               {
                   System.out.println("Yes");
                   flag=1;
                   break;
               }
               
       
           }
           if(flag==1)
           {break;
           }
        
	    }
	    if(!h.contains(sum)){
	 System.out.println("No");}
       return 0;
}}
