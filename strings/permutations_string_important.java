/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.HashSet;
import java.util.Set;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t!=0){
		    String str=sc.nextLine();
		    Set<String> s = new HashSet<String>();
		    s.addAll(pf(str));
		    int n = s.size();
        String arr[] = new String[n];
        arr = s.toArray(arr);
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
		    System.out.println();
		    t--;
		}
	}
	static Set<String>pf(String str){
	    Set<String>perm=new HashSet<String>();
	    if(str==null){
	        return null;
	    }
	    if(str.length()==0){
	        perm.add("");
	        return perm;
	    }
	    char initial=str.charAt(0);
	    String rem=str.substring(1);
	    Set<String>words=pf(rem);
	    for(String strnew:words){
	        for(int i=0;i<=strnew.length();i++){
	            perm.add(charinsert(strnew,initial,i));
	        }
	    }
	    return perm;
	}
	static String charinsert(String str,char c,int j){
	    String begin=str.substring(0,j);
	    String end=str.substring(j);
	    return begin+c+end;
	}
}
