class Solution {
    public boolean validTree(int n, int[][] edges) {
        List<Integer>[] al=new ArrayList[n];
        if (edges.length != n - 1) return false;//tree edges count should be n-1 ie nodes-1
        for(int i=0;i<n;i++)
        {
            al[i]=new ArrayList<>();
        }
        for(int n[]:edges)
        {
            al[n[0]].add(n[1]);
            al[n[1]].add(n[0]);
        }
        int[] state=new int[n];
        for(int i=0;i<n;i++)
        {
            state[i]=0;
        }
        Queue<Integer> q= new ArrayDeque<>();

        if(!bfs(0,al,q,state))return false;
        for(int s:state)
        {
            if(s==0)return false;
        }
        return true;
    }
    public boolean bfs(int i,List<Integer>[] al,Queue<Integer> q,int[] state)
    {
        if(state[i]==1) return false;
        if(state[i]==2) return true;
        state[i]=1;
        q.offer(i);
        while(!q.isEmpty())
        {
            int node = q.poll();
            List<Integer> nodes=al[node];
            for(int nei:nodes)
            {
                if(state[nei]==1){return false;}
                if(state[nei]==2||state[nei]==0){
                    state[nei]=1;
                q.offer(nei);
                }
            }
            state[node]=2;            
        }
        return true;
    }
}


//did BFS for this on my own little syntatical errors and also i need to learn how to do nomenclature of variables
