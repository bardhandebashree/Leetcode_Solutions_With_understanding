class Solution {
    List<Integer> path=new ArrayList<>();
    public int[] findOrder(int numCourses, int[][] prerequisites) {   
        List<Integer>[] adjecencyList=new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            adjecencyList[i]=new ArrayList<>();
        }
        int[] state=new int[numCourses];
        for(int pre[]:prerequisites)
        {
            int course=pre[0];
            int preCourse=pre[1];
            adjecencyList[preCourse].add(course);
        }
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<numCourses;i++)
        {
            if(state[i]==0)
            {
                if(!dfs(i,adjecencyList,state,s))
                return new int[0];
            }
        }
        int[] order=new int[numCourses];
        int i=0;
        while(!s.isEmpty())
        {
            order[i++]=s.pop();
        }
        return order;
    }
    public boolean dfs(int i, List<Integer>[] al,int[] state,Stack<Integer> s)
    {
        if(state[i]==1) return false;
        if(state[i]==2) return true;
        state[i]=1;

        
        for(int j=0;j<al[i].size();j++){
            if(!dfs(al[i].get(j),al,state,s))
                return false;
        }
        state[i]=2;
        s.push(i);
        return true;
    }
}

//Above using DFS postorder algorithm to find the cycle -
//  the graph we are using to keep as adjecency list but
//  state  array is to keep number of nodes incoming to 
// indexx of array
