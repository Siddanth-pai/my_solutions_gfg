//https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence/1
//https://www.geeksforgeeks.org/longest-consecutive-subsequence/
class GfG
{
    // Function to find Longest Consecutive Subsequence
    int findLongestConseqSubseq(int a[], int n)
    {
        
	    // Your code here	
	  int ans =0;
	  HashSet<Integer> hs = new HashSet<Integer>();
	  
	  for(int i=0;i<n;i++)
	    hs.add(a[i]);
	   //return max_count; 
	   
	   
	   for(int i=0;i<n;i++)
	   {
	       
	       
	       if(hs.contains(a[i]-1) == false)
	       {
	           int j=a[i];
	           while(hs.contains(j))
	           j++;
	           
	           
	           if(ans < j-a[i])
	             ans = j-a[i];
	       }
	       
	       
	   }
	   return ans;
    }
}
