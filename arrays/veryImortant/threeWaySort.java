//https://practice.geeksforgeeks.org/problems/three-way-partitioning/1
//https://hackerranksolutionc.blogspot.com/2018/06/three-way-partitioning-quicksort.html






These are the folowing steps:

    Maintain 3 variables low, high and mid
        low - all elements before low are less than low_value
        mid - all elements between low and mid are between low_value and high_value
        high - all elements after high are more than high_value
    Initially low, mid are set at 0 and high is at n-1
    Now, we iterate mid from 0 to high, and for every element
        if it is lower than low_value, we swap it with element at low, and increement low and mid
        else if it is higher than high_value, we swap it with element at high, and decreement high
        else we just increement mid
    This method ensures partition, as low and high maintain elements according to their values, and then change their positions, ensuring all elements before low are lower than low_value and all elements after high are higher than high_value










class GfG
{
	public ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int a, int b)
	{
        //add code here.
        //System.out.print(A)
        //Collections.sort(A);
        int l=0;
        int r=A.size()-1;
        int i = 0;
        while(i<=r)
        {
            
            
            if(A.get(i) < a)
            {
                int temp = A.get(l);
                A.set(l,A.get(i));
                A.set(i,temp);
                
                i++;
                l++;
            }
            else if(A.get(i) > b){
                int temp = A.get(r);
                A.set(r,A.get(i));
                A.set(i,temp);
                //i++;
                r--;
            }
             else{
                 i++;
            }
            
            
        }
        return A;
	} 
}
