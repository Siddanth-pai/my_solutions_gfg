/*package whatever //do not write package name here */
//use bfs...
//https://practice.geeksforgeeks.org/problems/snake-and-ladder-problem/0
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {static int count =0;
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0)
		{
		    int n = sc.nextInt();
		    int arr[] = new int[(n*2)];
		    for(int i=0;i<(n*2);i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    
		    int move[] = new int[31];
		    for(int i=0;i<arr.length;i=i+2)
		    {
		        move[arr[i]] = arr[i+1];
		    }
		    
		     for(int i=0;i<31;i++)
		    {
		        //move[arr[i]] = arr[i+1];
		       // System.out.print(move[i]);
		    }
		  //  System.out.print("i ");
		    sandl(move);
		    //System.out.println();
		     count=0;
		}
		
		
	}
	static class cell
	{
	    int x;int dis;
	    cell(int x,int dis)
	    {
	        this.x = x;
	        this.dis = dis;
	    }
	}
	
	static void sandl(int move[])
	{
	    
	    Vector<cell> q = new Vector<>();
	    int vis[] = new int[31];
	    
	    vis[1] =1 ;
	    q.add(new cell(1,0));
	    int lol=0;cell coll = null;;
	   while(q.isEmpty()==false)
	   { 
	       coll = q.firstElement();
	        q.remove(0);
	        if(coll.x == 30){
	         // System.out.println("lol" + coll.dis);
	         System.out.println( coll.dis);
	          return;
	        }
	        
	        for(int v = coll.x+1;v <= coll.x+6 && v<=30 ;v++)
	        {
	            if(vis[v]==0)
	            {
	                if(move[v] !=0)
	                {  vis[move[v]] =1;
	                    q.add(new cell(move[v],coll.dis+1));
	                }
	                else{vis[v] =1;
	                    q.add(new cell(v,coll.dis+1));
	                }
	            }
	        }
	    
	
	
	   }
	   //System.out.print(coll.dis); 
	}	
	
}
