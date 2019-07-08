//https://practice.geeksforgeeks.org/problems/coin-change/0
//https://www.geeksforgeeks.org/coin-change-dp-7/ .......................frankly i didnot use this in my code;
//"Back to Back Swe" in youtube channel.........................its in dp playlist
//see algorithms and ds small notebook




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
		    int arr[] = new int[n];
		    for(int i = 0; i<n;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    int sum = scan.nextInt();
		    coin_change(arr,n,sum);
		    t--;
		}
	}
	
	
	static int coin_change(int arr[],int n,int sum)
	{
	    int i=0;int j=0;
	    int ans[][] = new int[n+1][sum+1];
	    ans[0][0] =1;
	    for(i=0;i<n+1;i++)
	    {
	        for(j=0;j<sum+1;j++)
	        {
	            if(j==0 )
	            {
	                ans[i][j] = 1;
	            }
	            
	            else if(i >0 && j-arr[i-1]>=0)
	            {
	                ans[i][j] = ans[i-1][j] + ans[i][j-arr[i-1]];//this is the main part
	            }
	            else if(i>0){
	                ans[i][j] = ans[i-1][j];
	            }
	        }
	    }
	    System.out.println(ans[--i][--j]);
	    return 0;
	}
	
	
}
