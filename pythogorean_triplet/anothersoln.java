import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static void pythagoras(int array[])
    {
        Arrays.sort(array);
        int n = array.length;
        for(int i=0; i<n; i++)
            array[i] = array[i] * array[i];
        
/*        for(int i : array)
            System.out.print(i+" ");
        System.out.println();
*/            
        boolean result = false;
        for(int i=n-1; i>=2; i--)
        {
            int left = 0;
            int right = i-1;
            while(left < right)
            {
                if(array[left] + array[right] == array[i])
                {
                    result = true;
                    break;
                }
                if(array[i] < array[left] + array[right])
                    right--;
                else
                    left++;
            }
            
        }
        
        if(result == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int queries = Integer.parseInt(br.readLine());
        {
            for(int i=0; i<queries; i++)
            {
                int size = Integer.parseInt(br.readLine());
                String aux[] = br.readLine().split("\\s+");
                int array[] = new int[size];
                for(int j=0; j<size; j++)
                    array[j] = Integer.parseInt(aux[j]);
                pythagoras(array);           
            }
        }
	}
}
