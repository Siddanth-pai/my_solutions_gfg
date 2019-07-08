/*package whatever //do not write package name here */
// this also gives the number of pairs that gives the sum
import java.util.*;
import java.lang.*;
import java.io.*;
//https://www.geeksforgeeks.org/count-pairs-with-given-sum/
//1 2 4 6 7 sum= 4
//1 2 3  5 5 sum =10
class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t>0)
		{
		    int n = scan.nextInt();
		     int s = scan.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0; i<n;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    print_add(arr,n,s);
		    t--;
		    //System.out.println();
		}
		
		
		
		
	}
	
	
	
	
	
	public static void print_add(int arr[],int n,int sum)
	
	{
	    
	    
	    
	    HashMap<Integer, Integer> hm = new HashMap<>(); 
  
        // Store counts of all elements in map hm 
        for (int i=0; i<n; i++){ 
              
            // initializing value to 0, if key not found 
            if(!hm.containsKey(arr[i])) 
                hm.put(arr[i],0); 
                  
            hm.put(arr[i], hm.get(arr[i])+1); 
        } 
        int twice_count = 0; 
  
        // iterate through each element and increment the 
        // count (Notice that every pair is counted twice) 
        for (int i=0; i<n; i++) 
        { 
            if(hm.get(sum-arr[i]) != null) 
                twice_count += hm.get(sum-arr[i]); 
  
            // if (arr[i], arr[i]) pair satisfies the condition, 
            // then we need to ensure that the count is 
            // decreased by one such that the (arr[i], arr[i]) 
            // pair is not considered 
            if (sum-arr[i] == arr[i]) 
                twice_count--; 
        } 
        
        if(twice_count ==0){
            System.out.println("No");
        }
        else{
            System.out.println(twice_count/2);
            System.out.println("Yes");
        }
	}
	
	
}
