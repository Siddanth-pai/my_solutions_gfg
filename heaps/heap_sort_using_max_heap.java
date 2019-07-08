class GfG
{
    void buildHeap(int arr[], int n)
    {
        // Your code here
        for(int i=(n/2 )-1;i>=0;i--)
          heapify(arr,n,i);
          
          
         for(int i=n-1;i>=0;i--)
          {
              int temp = arr[i];
              arr[i]  =arr[0];
              arr[0] = temp;
               
              heapify(arr,i,0); 
          } 
        
        
          
         for(int i=0;i<n;i++)
          {
            //  System.out.print(arr[i]+" ");
          }
        
        
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        // Your code here
        
        int largest = i;
        int l = (2*i )+ 1;
        int r = (2*i) + 2;
        
        if(l<n  && arr[l] >arr[largest] )
          largest = l;
         if(r<n  && arr[r] >arr[largest] )
          largest = r;
          
          
        if(largest !=i)
        {
             int temp = arr[i];
              arr[i]  =arr[largest];
              arr[largest] = temp;
            heapify(arr,n,largest);
        }
           
          
          
          
        
    }
 }
