/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string/0
//https://www.geeksforgeeks.org/longest-palindromic-substring-set-2/

//look we have sepaarte while for even and odd pallindrome......outside for loop is for center point....
//
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		
		 Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0){
	         String str1=s.next();
	        // String str2=s.next();
	         
	        long_pallin(str1);
	        
	       }
	     }


    static public void long_pallin(String str1)
    {
        int maxlength = 1; // The result (length of LPS) 
  
        int start = 0; 
        int len = str1.length(); 
  
        int low=0;int high=0;; 
        
        for(int i=1;i<str1.length();i++)
        {
            
            low = i-1;
            high = i;
            
            while(low >=0 && high<len && str1.charAt(low) == str1.charAt(high))
            {
                if(high - low +1 > maxlength)
                {
                    start = low;
                    maxlength = high -low +1;
                }
                low--;//this is to expand the pallindrome from center to either side on left and right and check at the same time... 
                high++;//
            }
            low = i-1;
            high = i+1;
            
            while(low >=0 && high<len && str1.charAt(low) == str1.charAt(high))
            {
                if(high - low +1 > maxlength)
                {
                    start = low;
                    maxlength = high -low +1;
                }
                low--;
                high++;
            }
        }
      //  System.out.print(maxlength);
      //  System.out.print(start);
        for(int j=start;j<(start+maxlength);j++)
        {
            System.out.print(str1.charAt(j));
        }
        System.out.println();
    }



	
}
