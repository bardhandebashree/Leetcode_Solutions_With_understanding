class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ngp=new int[nums1.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> s=new Stack<>();
        int j=1;
        int c=0;
        for(int i=nums2.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek()<=nums2[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                map.put(nums2[i],-1);
            }
            else{
                map.put(nums2[i],s.peek());
            }
            s.push(nums2[i]);
            
        }
            for(int i=0;i<nums1.length;i++)
            {
                ngp[i]=map.get(nums1[i]);
            }
            return ngp;
        
    }
}