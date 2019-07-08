/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t-- > 0) {
		    String st = scan.next();
		    System.out.println(longestDistinctSubstring(st));
		}
	}
	
	public static int longestDistinctSubstring (String str) {
	    int len = 0, max = 0, i = 0;
	    Map<Character, Integer> map = new HashMap<Character, Integer>();
	    for (i = 0; i < str.length(); i++) {
            char ele = str.charAt(i);
            if (!map.containsKey(ele)) {
                map.put(ele, i);
                len++;
                max = (len > max) ? len : max;
            } else {
                i = map.get(ele);
                map.clear();
                len = 0;
            }
	    }
	    return max;
	}
}
