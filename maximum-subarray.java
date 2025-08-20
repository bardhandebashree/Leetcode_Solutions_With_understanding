class Solution {
    public int maxSubArray(int[] nums) {
        int curr=int sum=nums[0];
for(int i=1;i<nums.length;i++)
{
    curr=MATH.max(nums[i],curr+nums[i]);
    if(curr>sum)
    {
        sum=curr;
    }
}
return sum;
    }
}

//understanding subarray means contiguous set of array not picking and counting sub array
//at first I use sliding window solution but cant find solution
//hint shows kadanes algorithm
// int curr=int maximum=nums[0];
// for(int i=1;i<nums.length;i++)
// {
//     curr=max(nums[i],curr+nums[i]);
//     if(curr>maximum)
//     {
//         maximum=curr;
//     }
// }
// return maximum;
//stack cannot find solution
//two loops big-Oh(n^2)
//


