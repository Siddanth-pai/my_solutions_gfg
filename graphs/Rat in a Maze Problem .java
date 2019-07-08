//https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1


class GfG{
    static boolean isValid(int i,int j,int n)
    {
     if(i>=0 && i<n && j>=0 && j<n)
     return true;
    return false; 
    }
    static int dx[] ={ 0,0,1,-1};
    static int dy[] = { 1,-1,0,0 };
    static char dir[] = {'R','L','D','U'};
    static ArrayList<String> ans = new ArrayList<String>();
    
    
    
    static void dfs(int m[][],int vis[][],int n,String s,int p,int q)
    {
        
        if(p==n-1 && q==n-1)
        {
            ans.add(s);
            return;
        }
        
        vis[p][q] =1;
        for(int i=0;i<4;i++)
        {
            int x = p + dx[i];
            int y = q + dy[i];
            if(isValid(x,y,n) == true && m[x][y] ==1 &&vis[x][y] == 0){
            
            dfs(m,vis,n,s+dir[i],x,y);
            }
        }
        vis[p][q] =0;// very important...implrtant for backtracking......otherwise..om=nly one path will be displayed
    }
    
     public static ArrayList<String> printPath(int[][] m, int n)
     {
          //Your code here
          int vis[][]= new int[n][n];
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
            vis[i][j] = 0;
     }
          String s=""; 
        ans.clear();  //
    dfs(m,vis,n,s,0,0);
    Collections.sort(ans);
    return ans;
    }
    
   
         
}   
      
      
      
      
          
    
