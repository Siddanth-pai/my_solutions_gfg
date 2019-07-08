import java.util.*;
import java.lang.*;
import java.io.*;
class GFG{
	public static void main (String[] args)throws IOException{
	    //code
	    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
	    String s = buff.readLine();
	    int t = Integer.parseInt(s);
	    while(t-->0){
	        String s1[] = buff.readLine().split(" ");
	        int n = Integer.parseInt(s1[0]);
	        int k = Integer.parseInt(s1[1]);
	        int arr[] = new int[n];
	        String s2[] = buff.readLine().split(" ");
	        for(int i=0;i<n;i++)
	            arr[i] = Integer.parseInt(s2[i]);
	        Map<Integer,Integer> hm = new HashMap<>();
	        for(int i=0;i<n;i++){
	            if(!hm.containsKey(arr[i])){
	                hm.put(arr[i],1);
	            }
	            else if(hm.containsKey(arr[i])){
	                hm.put(arr[i],hm.get(arr[i])+1);
	            }
	        }
	        boolean flag = true;
	        for(int i=0;i<n;i++){
	            if(hm.get(arr[i])==k){
	                System.out.println(arr[i]);
	                flag = false;
	                break;
	            }
	        }
	        if(flag){
	            System.out.println(-1);
	        }
	    }
	}
}
