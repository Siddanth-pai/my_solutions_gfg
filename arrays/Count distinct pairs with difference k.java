https://practice.geeksforgeeks.org/problems/count-distinct-pairs-with-difference-k/0
Count distinct pairs with difference k
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	  Scanner sc=new Scanner(System.in);
	  int tc=sc.nextInt();
	  while(tc-->0)
	  {
	      int n=sc.nextInt();
	      int arr[]=new int[n];
	      int hash[]=new int[10001];
	      for(int m=0;m<10000;m++)
	      {
	          hash[m]=0;
	      }
	      int rount=0;
	      HashSet<Integer>m=new HashSet<Integer>();
	      HashSet<Integer>l=new HashSet<Integer>();
	      for(int i=0;i<n;i++)
	      {
	          arr[i]=sc.nextInt();m.add(arr[i]);
	          hash[arr[i]]++;
	          if(hash[arr[i]]>1&&l.contains(arr[i])!=true)
	          {
	              rount++;
	              l.add(arr[i]);
	          }
	      }
	      int k=sc.nextInt();
	      Arrays.sort(arr);
	      int count=0;
	      if(k!=0){
	      for(int j=0;j<n-1;j++)
	      {
	          if(arr[j]!=arr[j+1]){
	          if((m.contains(arr[j]+k))==true)
	          {
	              count++;
	          }
	          }
	      }
	       System.out.println(count);
	      }
	      else
	      System.out.println(rount);
	  }
	 }
}
