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
		    int val[] = new int[n+1];
		    int w[] = new int[n+1];
		    val[0] =0;
		    w[0] = 0;
		    for(int i = 1; i<=n;i++)
		    {
		        val[i] = scan.nextInt();
		         
		    }
		     for(int i = 1; i<=n;i++)
		    {w[i] = scan.nextInt();
		       
		    }
		   // int sum = scan.nextInt();
		    zero_one(val,w,n,m);
		    t--;
		}
	}
	
	
	static int zero_one(int val[],int w[],int n,int sum)
	{
	    int i=0;int j=0;
	    int ans[][] = new int[n+1][sum+1];
	   // ans[0][0] =0;
	   try{
	    for(i=0;i<=n;i++)
	    {
	        for(j=0;j<sum+1;j++)
	        {
	            if(j==0 || i==0)
	            {
	                ans[i][j] = 0;
	            }
	            
	            else if( j<w[i])
	            {
	                ans[i][j] = ans[i-1][j] ;//this is the main part
	            }
	            else {
	                ans[i][j] = Math.max(ans[i-1][j],ans[i-1][j-w[i]] + val[i]) ;
	            }
	        }
	    }
	    }catch(ArrayIndexOutOfBoundsException e)
	    {
	        System.out.print(i+"lol"+j);
	    }
	    System.out.println(ans[--i][--j]);
	    return 0;
	}
	
	
}
