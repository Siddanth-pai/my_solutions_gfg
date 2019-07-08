import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    s.nextLine();
	    while(t-->0){
	        String str=s.nextLine();
	        int n=str.length();
	        HashMap<Character,Integer> map=new HashMap<>();
	        for(int i=0;i<n;i++){
	            char c=str.charAt(i);
	            map.put(c,1);
	        }
	        
	        for(int i=0;i<n;i++){
	            char c=str.charAt(i);
	            if(map.containsKey(c)){
	                System.out.print(c);
	                map.remove(c);
	            }
	        }
	       System.out.println(); 
	    }
	 }
}
