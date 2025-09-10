class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,<List<Integer>> cMap=new HashMap<>();
        int[] indegree=new int[numCourses];
        for(int pre[]:prerequisites)
        {
            int course=pre[0];
            int preCourse=pre[1];

            cMap.putIfAbsent(preCourse,new ArrayList<>());
            cMap.get(preCourse).add(course);

            indegree[course]++;

            
        }
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<indegree.length;i++)
        {
            if(indegree[i]==0)
            {
                q.offer(i);
            }
        }
        int target=0
        while(!q.isEmpty())
        {
            
            int currCourse=q.poll();
            target++;
            for(int n:cMap.get(currCourse)){}
            indegree[n]--;
            if(indegree[n]==0)
            {
                q.offer(n);
            }
            
                }
                        return target==numCourses;

            }
    }


//Above using KAHNS algorithm to find the cycle - the graph we are using to keep as adjecency list but indegree array is to keep number of nodes incoming to indexx of array
