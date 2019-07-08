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
	         
	         rot_str(str1,str2);
	      
	     }
	     
	}  
	     static int rot_str(String str1,String str2)
	     {
	           
	           int crot=0;
	           int arot=0;
	           
	           String s = str2.substring(str2.length()-2).concat(str2.substring(0,str2.length()-2));
	           if(s.equals(str1))
	           {
	               arot=1;
	           }
	           
	           
	           String r = str2.substring(2).concat(str2.substring(0,2));
	           if(r.equals(str1))
	           {
	               crot=1;
	           }
	           
	           if(arot==1 || crot ==1){
	           System.out.println("1");
	           }
	           else{
	                System.out.println("0");
	           }
	           return 0;
	     }
	
	
	
	
	
	
	
	
}
