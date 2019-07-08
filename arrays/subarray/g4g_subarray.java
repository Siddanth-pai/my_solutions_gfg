import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static void findsum(Integer[] arr,int n,int s)
    {
        int i = 0;
        while(i<(arr.length-1))
        {
            int sum = 0;
            for(int j = i;j<arr.length;j++)
            {
                sum += arr[j];
                if(sum == s)
                {
                    System.out.println(i+1+" "+(j+1));
                    return ;
                }
                if(sum > s)
                {
                    continue;
                }
            }
            i++;
        }
        System.out.println(-1);
    }
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t>0)
		{
		    int n = scan.nextInt() , s = scan.nextInt();
		    Integer arr[] = new Integer[n];
		    for(int i = 0; i<n;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    findsum(arr,n,s);
		    t--;
		}
	}
}
