class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s=new Stack<>();
        int maxArea=0;
        for(int i=0;i<=heights.length;i++)
        {
            int h=(i==heights.length)?0:heights[i];

                while(!s.isEmpty() && heights[s.peek()]>h)
                {
                    int hOut=s.pop();
                    int height=heights[hOut];
                    int width = s.isEmpty() ? i : i - s.peek() - 1;                    int area=height*width;
                    maxArea=Math.max(maxArea,area);
                }
                    s.push(i);
            


            
        }
        return maxArea;
    }
}