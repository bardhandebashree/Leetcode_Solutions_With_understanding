//Tried recursion and sliding window butorder can be n^3
// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int l=0;
//         int count=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             int s=sum(l,i,nums);
//             while(s>=k)
//             {
//                 if(s==k)
//                 {
//                     count++;
//                 }
//                 else
//                 {
//                     s=sum(0,i,nums)-sum(0,l,nums);
//                     l++;
//                 }
//             }
            
//         }
//         return count;
//     }
//     public int sum(int l,int i,int[] nums)
//     {
//         if(l==i)
//         {
//             return nums[l];
//         }
//         else
//         {
//             return nums[l]+sum(l+1,i,nums);
//         }

//     }
// }

// We will trying memoization according to prefix 

//totalCurrent-subarray=0 or k
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> sumMap=new HashMap<>();
        sumMap.put(0,1);
        int total=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
            if(sumMap.containsKey(total-k))
            {
                count+=sumMap.get(total-k);
            }
            sumMap.put(total,sumMap.getOrDefault(total,0)+1);
        }
        return count;
    }

}
