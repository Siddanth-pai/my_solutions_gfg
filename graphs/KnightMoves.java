/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/knight-walk/0
//https://www.geeksforgeeks.org/minimum-steps-reach-target-knight/
//remeber bfs is used to find the shortest path
//look in that for loop each cell object stores the distance from the parent.....we find in all the direction...all the visited the nodes are added in the queue..
//really good
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
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int x1 = scan.nextInt();
		    int y1 = scan.nextInt();
		   
		   knight(n,m,x,y,x1,y1); 
		    t--;
		    System.out.println();
		}
	}
	static class cell
	{
	    int x;int y;int dis;
	    cell(int x,int y,int dis)
	    {
	        this.x = x;
	        this.y = y;
	        this.dis = dis;
	    }
	}
	
	static boolean isValid(int x,int y,int n,int m)
	{
	    if(x >=1 && x<=n && y>=1 && y<=m)
	    {
	        //System.out.print(n);
	        return true;
	    }
	    return false;
	}
	static void knight(int n,int m,int x,int y,int x1,int y1)
	{
	   Vector<cell> q = new Vector<>();
	   int vis[][]= new int[n+1][m+1];
	   int dx[] = {2, 2, -2, -2, 1, 1, -1, -1};
       int dy[] = {-1, 1, 1, -1, 2, -2, 2, -2};
	   
	   for(int i=1;i<=n;i++)
	   for(int j=1;j<=m;j++)
	   {
	       vis[i][j] = 0;
	   }
	   int flag=0;
	   q.add(new cell(x,y,0));
	   vis[x][y] = 1;
	   //cell yoo = q.remove(0);
	  ///System.out.print(isValid(yoo.x,yoo.y,n,m));
	  int s,t;
	  while(q.isEmpty()==false)
	  {
	      cell temp = q.firstElement();  
        q.remove(0);  
	     
	      
	      if(temp.x == x1 && temp.y == y1){
	        System.out.print(temp.dis);
	      flag=1;
	          break;
	      }
	        
	     for(int i=0;i<8;i++)
	     {
	         s= temp.x + dx[i];
	         t = temp.y + dy[i];
	         
	        if(isValid(s,t,n,m) &&  vis[s][t] == 0)
	        {
	            vis[s][t] = 1;
	            q.add(new cell(s,t,temp.dis+1));
	        }
	     }
	   
	        
	  }
	  if(flag==0)
	  System.out.print("-1");
	}
	
}
