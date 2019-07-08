//Mindblowing answer
//store the consecutive sum in the order
//add zero in the beginning to hashset
//if the modified arrays value is already present in the hashset then 

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
	      int a;
	      for(int i=0;i<n;i++)
	      {
	          a=sc.nextInt();
	          if(i==0)
	          {
	              arr[i]=a;
	          }
	          else{
	          arr[i]=a+arr[i-1];}
	      }
	      HashSet<Integer>m=new HashSet<Integer>();
	      m.add(0);
	      boolean joy=false;
	      for(int j=0;j<n;j++)
	      {
	          if(m.contains(arr[j])==true)
	          {
	              joy=true;
	          }
	          else
	          m.add(arr[j]);
	      }
	      if(joy==true)
	      {
	          System.out.println("Yes");
	      }
	      else
	      System.out.println("No");
	  }
	 }
}
