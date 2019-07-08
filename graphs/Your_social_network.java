//be proud u solved this without any assistance
//https://practice.geeksforgeeks.org/problems/your-social-network/0
/*package whatever //do not write package name here */
//for the input 
//3
// 1 2
//matrix  x: and y: 1 2 3
//   -1 -1 -1
//   1 -1 -1
//   0  1  -1
// those strings are only for printing the strings in the correct oreder that is expected
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int n=0;int arr[][] ={{0},{0},{0}};
    while(t-- >0)
    {
        
         n = sc.nextInt();
         arr = new int[n+1][n+1];
        int con[] = new int[n+1];
        con[0] =-1;
        con[1]=-1;
        for(int i=2;i<=n;i++)
        {
            con[i] = sc.nextInt();
        }
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i>=2 )
                {
                    if(con[i] == j)
                    arr[i][j] =1;
                }
                if(i==j )
                {
                    arr[i][j] = -1;
                }
                 if(j>i)
                {
                     arr[i][j] = -1;
                }
             
                
            }
        }
        
        network(arr,n);
        System.out.println();
    }
    
	}
	
	static class cell
	{
	    int y,dis;
	    cell(int y,int dis)
	    {
	        this.y = y;
	        //this.y =y;
	        this.dis = dis;
	    }
	}
	
	
	
	static void network(int arr[][],int n)
	{
	
	    Vector<cell> q = new Vector<cell>();
	    
	    cell temp;
	    for(int i=2;i <=n;i++)
	    {String str="";
	        for(int j=1;j<=n;j++)
	        {
	            if(arr[i][j]==1)
	            {
	                //System.out.print(i+" "+ j+" "+"1 ");
	                str = str + i+" "+ j+" "+"1 ";
	                q.add(new cell(j,1));
	                break;
	            }
	        }
	        while(q.isEmpty() ==false)
	        {//System.out.println("lol");
	             temp = q.firstElement();
	            q.remove(0);
	           // if(cell.x ==1)
	            for(int x=1;x<temp.y;x++)
	            {   //System.out.println("lol");
	                if(arr[temp.y][x] ==1)
	                {
	                    //System.out.print(i +" "+x+" "+ (temp.dis+1) +" " );
	                    str =  i +" "+x+" "+ (temp.dis+1) +" " + str ;
	                q.add(new cell(x,temp.dis+1));
	               // break;
	                }
	            }
	            
	        }
	        System.out.print(str);
	    }
	    
	}
	}
	
	
	
	

