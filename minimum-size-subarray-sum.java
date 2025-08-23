class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int index=0;
        int result=Math.maximum;
        for(int right=0;right<nums.length;right++)
        {
            sum=sum+nums[right];
            if(sum>=target)
            {
                result=Math.min(result,(right-left)+1);
                while(sum<target)
                {
                    left++;
                    right=left; 
                    sum=0;
                }
            }
        }
        return result==Math.maximum?0:result;
        
    }
}
//lets use sliding window for this as we have to find subarray
l