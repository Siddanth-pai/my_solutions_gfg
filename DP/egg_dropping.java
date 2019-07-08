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
		   
		   // int sum = scan.nextInt();
		   int min = egg_dropping(n,m);
		   //System.out.print(min);
		    t--;
		}
	}
	
	
	static int egg_dropping(int n,int k)
	{
	    //int i=0;int j=0;
	  int eggFloor[][] = new int[n+1][k+1]; 
        int res; 
        int i, j, x; 
           
        // We need one trial for one floor and0 trials for 0 floors 
        for (i = 1; i <= n; i++) 
        { 
            eggFloor[i][1] = 1; 
            eggFloor[i][0] = 0; 
        } 
           
       // We always need j trials for one egg and j floors. 
        for (j = 1; j <= k; j++) 
            eggFloor[1][j] = j; 
           
        // Fill rest of the entries in table using optimal substructure 
        // property 
        for (i = 2; i <= n; i++) 
        { 
            for (j = 2; j <= k; j++) 
            { 
                eggFloor[i][j] = Integer.MAX_VALUE; 
                for (x = 1; x <= j; x++) 
                { 
                     res = 1 + Math.max(eggFloor[i-1][x-1], eggFloor[i][j-x]); 
                     if (res < eggFloor[i][j]) 
                        eggFloor[i][j] = res; 
                } 
            } 
        } 
           
        // eggFloor[n][k] holds the result 
        System.out.print(eggFloor[n][k]);
        System.out.println();
        return eggFloor[n][k]; 
//	return min+1;    
	}
	
}	
