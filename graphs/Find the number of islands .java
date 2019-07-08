//https://practice.geeksforgeeks.org/problems/find-the-number-of-islands/1
class GFG
{static int flag=0;
static int vis[][];
    static int dx[] ={ 0,0,1,-1,-1,-1,1,1};
    static int dy[] = { 1,-1,0,0,-1,1,-1,1};
    public static int findisland(int[][]a,int n,int m)
    {   
 //Your code here
 int N =n;
 int M= m;
  vis = new int[N][M];
for(int i=0;i<N;i++)
for(int j=0;j<M;j++)
   vis[i][j] = 0;
  int count=0;
  for(int i=0;i<N;i++)
for(int j=0;j<M;j++){
   
if(vis[i][j] ==0 && a[i][j]==1){
     
dfs(vis,a,N,M,i,j,flag);
// System.out.println(flag+"lolll");
    count++;
//if(flag==1){

//flag=0;
}
}

return count;
}

static boolean isValid(int x,int y,int n,int m)
	{
	    if(x >=0 && x<n && y>=0 && y<m)
	    {
	        //System.out.print(n);
	        return true;
	    }
	    return false;
	}

static void  dfs(int vis[][],int a[][],int N,int M,int p,int q,int flag)
{
    
    vis[p][q] =1;
   /* if(a[p][q] ==0)
    {
        return;
    }
    */
 
 for(int i=0;i<8;i++)
 {
     
     int x= p+ dx[i];
     int y = q+dy[i];
     
     if(isValid(x,y,N,M)==true && vis[x][y]==0 && a[p][q] ==1)
     {//flag =1;
    
         dfs(vis,a,N,M,x,y,flag);
     }
     
 }
    
    
}
}
