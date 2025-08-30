class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr=new int[temperatures.length];
        Stack<Integer> s=new Stack<>();
        int j=1;
        int c=0;
        for(int i=temperatures.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek()<=temperatures[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                arr[i]=0;
            }
            else{
                arr[i]=(temperatures.size()-i)-s.size();
            }
            s.push(temperatures[i]);  
        }
        return arr;
    }
}