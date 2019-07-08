/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/flood-fill-algorithm/0
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
		   for(int i=0;i<n;i++)
		   {
		       for(int j=0;j<m;j++)
		       {
		           arr[i][j] = scan.nextInt();
		       }
		   }
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int k = scan.nextInt();
		   flood(n,m,x,y,k,arr); 
		    t--;
		    System.out.println();
		}
		
	}
	
	
	
	static class cell
	{
	    int x;int y;
	    cell(int x,int y)
	    {
	        this.x = x;
	        this.y = y;
	    }     
	}
	static int dx[] ={ 0,0,1,-1};
    static int dy[] = { 1,-1,0,0 };
	static boolean isValid(int x,int y,int n,int m)
	{
	    if(x >=0 && x<n && y>=0 && y<m)
	    {
	        //System.out.print(n);
	        return true;
	    }
	    return false;
	}
	
	
	static void flood(int n,int m,int x,int y,int k,int arr[][])
	{
	    Vector<cell> q = new Vector<>();
	    q.add(new cell(x,y));
	    int vis[][] = new int[n][m]; 
	    for(int i=0;i<n;i++)
		   {
		       for(int j=0;j<m;j++)
		       {
		           vis[i][j] =0;
		       }
		   }
		   int uni = arr[x][y];
	    vis[x][y] =1;
	    arr[x][y] = k;
	     
	    while(q.isEmpty()==false)
	    {  //System.out.println("lol");
	        cell temp = q.firstElement();
	        q.remove(0);
	        
	        
	        for(int i=0;i<4;i++)
	        {
	            int s = dx[i] + temp.x;
	            int t =dy[i] + temp.y;
	            
	            if(isValid(s,t,n,m) == true && vis[s][t] ==0 && arr[s][t] ==uni)
	            {
	                 vis[s][t] =1;
	                 arr[s][t] = k;
	                 q.add(new cell(s,t));
	            }
	            
	        }
	
	    }
	     for(int i=0;i<n;i++)
		   {
		       for(int j=0;j<m;j++)
		       {
		           //arr[i][j] = sc.nextInt();
		           System.out.print(arr[i][j]+" ");
		       }
		   }
	    
	    
	}
	
//	7 5 3 5 6 2 9 1 2 7 0 9 3 6 30 6 2 6 1 8 7 9 2 0 2 3 7 5 
//0 0 3 4 9 2 7 4 2 5 2 4 4 3 8 6 0 8 9 66 66 3 1 8 3 4 66 66 4 5 1 7 
//0 0 3 4 9 2 7 4 2 5 2 4 4 3 8 66 0 8 9 2 2 3 1 8 3 4 2 2 4 5 1 7 
	/*
	0 5 5 0 5 5 5 5 0 5 2 3 
8 8 8 8 
1 2 9 4 1 2 9 4 1 2 9 4 1 3 2 4
	
	*/
	
}
