import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     int T;
	     Scanner s = new Scanner(System.in);
	     T = s.nextInt();
	     for(int i=0; i<T; i++)
	     {
	         int N, S;
	         N = s.nextInt();
	         S = s.nextInt();
	         int A[] = new int[N];
	         for(int j=0; j<N; j++)
	            A[j] = s.nextInt();
	         function(A, S);
	     }
	 }
	 
	 public static void function(int A[], int S)
	 {
	     //System.out.println("array lenth = " + A.length);
	     int length = A.length;
	     int sum = A[0];
	     int l =0;
	     int r = 0;
	     while(l <= r && r <= A.length-1)
	     {
	         if(sum == S)
	         {
	             System.out.println(l+1+" "+(r+1));
	             return;
	         }
	         
	         if(sum < S && ++r <= A.length-1)
	         {
	             sum = sum + A[r];
	         }
	         
	         else if(sum > S)
	         {
	             
	             sum = sum - A[l];
	             l++;
	             if(l > r)
	             {
	                 r = l;
	                 if(r <= A.length-1)
	                    sum = A[r];
	             }
	         }
	         
	     }
	     
	     System.out.println("-1");
	     
	 }
}
