/*package whatever //do not write package name here */
//see the array from left and right aat the same time  ......this approach else is used because of condition 2 2 5 2 2 where initially rsum == lsum
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
		    equi(arr,s);
		    t--;
		}
		
		
	}
	
	static int equi(int a[],int s)
	{  int flag =0;
	    int lsum=a[0];int rsum=a[s-1];int i=1;int j = s-2;
	    if(s==1){
	        System.out.println("1");
	    }
	  else{  
	    while(i < j)
	    {
	       
	        flag=1;// for input 26 26 which never comes in the while loop
	         if(lsum < rsum){
	            lsum += a[i];
	            i++;
	        }
	        else if(rsum < lsum) {
	            rsum+= a[j];
	            j--;
	        }
	        else
	        {
	            lsum += a[i];
	            i++;
	        }
	    }
	    if(flag == 1 && lsum == rsum)
	    {
	        System.out.println(i+1);
	    }
	    else{
	         System.out.println("-1");
	    }
	  }
	   return 0; 
	}
	
	
	
	
}
