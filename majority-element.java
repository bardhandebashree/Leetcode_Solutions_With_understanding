// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer, Integer> countMap = new HashMap<>();
//         for(int i=0;i<nums.length;i++)
//         {
//             if(countMap.containsKey(nums[i]))
//             {
//                 countMap.put(nums[i],countMap.get(nums[i])+1);
//             }
//             else
//             {
//                 countMap.put(nums[i],1);
//             }
//         }
//         int max=Integer.MIN_VALUE;
//         int maxKey=-1;
//         for(Integer keys:countMap.keySet())
//         {
//             int val=countMap.get(keys);
//             if (val>max)
//             {
//                 max=val;
//                 maxKey=keys;
//             }
//         }
//         return maxKey;
//     }
// }

//Above Code is taking TC: O(n): 
//SC: O(n)
//But this beat 23% as hashmap is slower in JAVA then Arithematic Operations
//to make SC :O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;int choosen=0;
        for(int num:nums)
        {
            if(count==0)
            {
                choosen=num;
            }
            count=(choosen==num)?count+1:count-1;
        }
        return choosen;
    }
}