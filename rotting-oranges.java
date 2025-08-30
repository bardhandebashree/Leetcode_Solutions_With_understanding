class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int fresh=0;
        Queue<int[]> q=new ArrayDeque<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1 )
                {
                    fresh++;
                }
                if(grid[i][j]==2)
                {
                    q.offer(new int[]{i,j});
                }
            }
        }
        if(fresh==0) return 0;
        int minutes=-1;
        int[][] dirs={{-1,0},{0,-1},{1,0},{0,1}};
        while(!q.isEmpty())
        {
            int size=q.size();
            minutes++;
            for(int i=0;i<size;i++){
            int[] curr=q.poll();
            for(int[] d:dirs)
            {
                int x=curr[0]+d[0];
                int y=curr[1]+d[1];
                if(x<m && x>=0 && y<n && y>=0 &&  grid[x][y] == 1)
                {
                    grid[x][y]=2;
                    q.offer(new int[]{x,y});
                    fresh--;

                }
            }
            }

        }
        return fresh == 0 ? minutes : -1;
    }
}