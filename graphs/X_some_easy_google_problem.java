/*package whatever //do not write package name here */

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
		    int vis[][] = new int[n][m]; 
		    char arr[][] = new char[n][m];
		   
		  for(int z=0; z<n; z++){
	            String f = scan.next();
	            arr[z]=f.toCharArray();
	        }
		    for(int i=0;i<n;i++)
		   {
		       for(int j=0;j<m;j++)
		       {
		           vis[i][j] =0;
		       }
		   }
		   for(int i=0;i<n;i++)
		   {
		       for(int j=0;j<m;j++)
		       {
		          if(vis[i][j]==0 && arr[i][j] == 'X'){
		           flood(n,m,arr,i,j,vis);}
		       }
		   }
		   //flood(n,m,arr); 
		    t--;
		    System.out.println(count);
		    count=0;
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
    static int count =0;
	static boolean isValid(int x,int y,int n,int m)
	{
	    if(x >=0 && x<n && y>=0 && y<m)
	    {
	        //System.out.print(n);
	        return true;
	    }
	    return false;
	}
	
	static void flood(int n,int m,char arr[][],int x,int y,int vis[][])
	{
	    Vector<cell> q = new Vector<>();
	    q.add(new cell(x,y));
	    
	   
		   //int uni = arr[x][y];
	    vis[x][y] =1;
	    //arr[x][y] = k;
	     int flag=0;
	    while(q.isEmpty()==false)
	    {  //System.out.println("lol");
	        cell temp = q.firstElement();
	        q.remove(0);
	        
	        
	        for(int i=0;i<4;i++)
	        {
	            int s = dx[i] + temp.x;
	            int t =dy[i] + temp.y;
	            
	            if(isValid(s,t,n,m) == true && vis[s][t] ==0 && arr[s][t] =='X')
	            {    flag=1;
	                 vis[s][t] =1;
	                // arr[s][t] = k;
	                 q.add(new cell(s,t));
	            }
	           
	            
	        }
	
	    }
	    
	   
	        count++;
	    
	    
	}
	
	
	
	
	
	
	
	
}
