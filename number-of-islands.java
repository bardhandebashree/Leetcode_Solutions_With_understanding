class Solution {
    public int numIslands(char[][] grid) {
        Queue<int[]> q= new ArrayDeque<>();
        int[][] dir={{0,1},{1,0},{0,-1},{-1,0}};
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++)
        {
        for(int j=0;j<n;j++)
        {
            if(grid[i][j]=='1')
            {
                count++;
                q.offer(new int[]{i,j});
                grid[i][j]='0';
            }
        
        while(!q.isEmpty())
        {
            int[] curr=q.poll();
            for(int[] d:dirs)
            {
                int x=curr[0]+d[0];
                int y=curr[1]+d[1];
                if(x<m && x>=0 && y<n && y>=0 &&  grid[x][y] == '1')
                {
                    q.offer(new int[]{x,y});
                    grid[x][y]='0';
                }
            }
        }
        }
        }
        
        
    }
}


As we used BFS its queue is taking more time
we will solve it using dfs again