import java.util.*;
import java.lang.*;
import java.io.*;
//https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix/0
class GFG {
	public static void main (String[] args) {
		//code
	//	int rs=0;int cs=0;int re=0;int re=;
	Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t>0)
		{
		    int m = scan.nextInt();
		     int n = scan.nextInt();
		    int arr[][] = new int[m][n];
		    for(int i = 0; i<m;i++)
		    {
		        for(int j = 0; j<n;j++)
		    {
		        arr[i][j] = scan.nextInt();
		    }
		    }
		    equi(arr,m,n);
		    t--;
		}
		
		
	}
	
	static void equi(int a[][],int m,int n)
	{
	    
	    int sr=0; int sc=0; int er=m-1; int ec=n-1;
	    int v[][]= new int[m][n];
	    int i=0;int j=0;
	     for(i = 0; i<m;i++)
		    {
		        for(j = 0; j<n;j++)
		    {
		       //System.out.print(v[i][j]+" ");
		       v[i][j]=0;
		    }
		    // System.out.println();
		    }
	    j=i=0;
	    while(sr<=er && sc<=ec)
	    {
	        
	        
	        for(j=sc;j<ec;j++)
	            
	        if(v[sr][j]==0){
	         System.out.print(a[sr][j]+" ");
	         v[sr][j]=1;
	            
	        }
	         
	         
	        for(i=sr;i<=er;i++)
	        if(v[i][ec]==0){
	         System.out.print(a[i][ec]+" ");
	         v[i][ec]=1;
	        }
	        
	        
	        for(j=ec-1;j>sc;j--)
	        if(v[er][j]==0){
	         System.out.print(a[er][j]+" ");
	         v[er][j]=1;
	        }
	        
	        for(i=er;i>sr;i--)
	        if(v[i][sr]==0){
	         System.out.print(a[i][sr]+" ");
	         v[i][sr]=1;
	        }
	       sr++;sc++;ec--;er--; 
	    }
	  //  
	  System.out.println();
	    for( i = 0; i<m;i++)
		    {
		        for(j = 0; j<n;j++)
		    {
		     //  System.out.print(a[i][j]+" ");
		    }
		   //  System.out.println();
		    }
	    
	    
	    
	    
	    
	    
	    
	    
	}
	
	
}
