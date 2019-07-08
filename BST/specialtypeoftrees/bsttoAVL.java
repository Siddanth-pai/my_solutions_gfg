import java.util.*;
import java.lang.*;
import java.io.*;
//https://practice.geeksforgeeks.org/problems/array-to-bst/0
//https://www.geeksforgeeks.org/sorted-array-to-balanced-bst/
//https://www.geeksforgeeks.org/convert-normal-bst-balanced-bst/

//look if the question is given about  a  bst to balanced bst(Avl)....then first store the bst values in an array(inorder manner) as it stores the sorted manner

//then conert this array to balanced bst..........make mid element a root   ...then peroform recursion
// root.left= mid of left part........root.right = mid of right


class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int i=0;i<tc;i++)
		{  
		    int size = sc.nextInt();
		   int arr[] = new int[size];
		   	for(int j=0;j<size;j++)
		{
		    arr[j] = sc.nextInt();
		
		}
		bb(arr,0,size-1);
		System.out.println();
		  
	}
	}
	
	static void bb(int arr[],int min,int max)
	{
	    
	    if(min>max)
	      return;
	    int mid = (min + max)/2;
	    
	    
	   // Node root = new Node(arr[mid]);
	    System.out.print(arr[mid]+" ");
	    //root.left = 
	    bb(arr,min,mid-1);
	    //root.right = 
	    bb(arr,mid+1,max);
	    
	    
	    
	}
	
	
	
	
}
