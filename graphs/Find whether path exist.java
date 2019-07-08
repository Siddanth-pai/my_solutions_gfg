import java.util.*;
import java.lang.*;
import java.io.*;
//https://practice.geeksforgeeks.org/problems/find-whether-path-exist/0
//try normal bfs solution ....that lab one
class GFG {
        static class cell
	{
	    int x;int y;
	    cell(int x,int y)
	    {
	        this.x = x;
	        this.y = y;
	        //this.dis = dis;
	    }
	}
	public static void main (String[] args) {
		//code
    
        
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t>0)
		{
		    int n = scan.nextInt();
		    int arr[][]=new int [n][n];
		    int vis[][] = new int[n][n];
		    cell init = null;cell dest = null;
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            arr[i][j] = scan.nextInt();
		            if(arr[i][j] ==1)
		            {
		              init = new cell(i,j)  ;
		            }
		            if(arr[i][j] ==2)
		            {
		              dest = new cell(i,j)  ;
		            }
		            vis[i][j]=0;
		        }
		    }
		   
		   knight(arr,n,init,dest,vis); 
		    t--;
		    System.out.println();
		}
	}
	static boolean isValid(int x,int y,int n)
	{
	    if(x >=0 && x<n && y>=0 && y<n)
	    {
	        //System.out.print(n);
	        return true;
	    }
	    return false;
	}
	
	static void knight(int arr[][],int n,cell init,cell dest,int vis[][])
	{  int flag=0;
	    //vector()
	  //  System.out.print(init.y);
	  Vector<cell> q = new Vector<>();
	  
	  q.add(init);
	     int dx[] = {0,0,1,-1};
       int dy[] = {1,-1,0,0};
	  
	  vis[init.x][init.y] =1;
	  cell temp;int s,t;
	  while(q.isEmpty() == false)
	  {
	      temp = q.firstElement();
	      q.remove(0);
	      
	    
	      for(int i=0;i<4;i++)
	      {
	          s = temp.x + dx[i];
	          t = temp.y +dy[i];
	          
	          if(isValid(s,t,n) && arr[s][t]==3 && vis[s][t] ==0)
	          {
	             // System.out.print(s);System.out.println(t);
	              vis[s][t] =1;
	              q.add(new cell(s,t));
	          }
	          else  if(isValid(s,t,n) && arr[s][t]==2 && vis[s][t] ==0 )
	          {flag=1;
	              //System.out.print(s);System.out.println(t);
	              System.out.print("1");
	              vis[s][t] =1;
	              //q.add(new cell(s,t));
	              break;
	          }
	          
	      }
	      
	  }
	  //System.out.println(vis[dest.x][dest.y]);
	 if(vis[dest.x][dest.y]==0)
	 System.out.print("0");
	  
	}
}
