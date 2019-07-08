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
	         String str2=s.next();
	         
	        int f= anagram(str1,str2);
	        if(f==1){
	            System.out.println("NO");
	        }
	       else{
	            System.out.println("YES");
	       }
	     }
	}
	
	
 static	int anagram(String str1,String str2)
	{
	    HashMap<Character,Integer> hs = new HashMap<>();
	    HashMap<Character,Integer> hr = new HashMap<>();
	    
	    int i =0;int flag=0;
	    if(str1.length() != str2.length())
	        {flag=1;
	        return flag; 
	        }
	    
	        while(i < str1.length()){
	            if(hs.get(str1.charAt(i)) == null)
	            hs.put(str1.charAt(i),1);
	            else{
	                hs.put(str1.charAt(i),hs.get(str1.charAt(i) +1));
	            }
	            i++;
	        }
	        i=0;
	         while(i < str2.length()){
	            if(hr.get(str2.charAt(i)) == null)
	            hr.put(str2.charAt(i),1);
	            else{
	                hr.put(str2.charAt(i),hr.get(str2.charAt(i) +1));
	            }
	            i++;
	        }
 	     i=0;  
	    
   
      while(i < str1.length()){
          
          if(hr.containsKey(str1.charAt(i)))
          {
              if(hs.get(str1.charAt(i)) != hr.get(str1.charAt(i))){
                  flag=1;
                  break;
              }
          }
          else{
              flag=1;
              break;
          }
          i++;
      }
    	    
	    return flag;
	}
	
}
