// class Solution {
//     public int longestConsecutive(int[] nums) {
//         HashMap<Integer,Integer> exsistMap=new HashMap<>();
//         int flag=0;
//         int maxCount=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             int c=nums[i];
//             int ca=c+1;   
//             int cb=nums[i]--;   
//             if(exsistMap.containsKey(c))
//             {
//             exsistMap.put(c,1);
//             flag++;
//             }
//             else{exsistMap.put(c,0);}
//             if(exsistMap.containsKey(ca))
//             {
//             exsistMap.put(ca,1);
//             flag++;
//             }
//             else{exsistMap.put(ca,0);}

//             if(exsistMap.containsKey(cb))
//             {
//             exsistMap.put(cb,1);
//             flag++;
//             }
//             else{exsistMap.put(cb,0);}
//             System.out.println(exsistMap);

//             maxCount=Math.max(maxCount,flag);
//         }
//         return maxCount;

//     }
// }


class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> setExsist=new HashSet<>();
        int flag=0;
        int maxCount=0;
        for(int num:nums)
        {
            setExsist.add(num);
            
        }
        if(setExsist.size()>0)
        {
            maxCount=1;
        }
        for(int num:setExsist)
        {
            if(!setExsist.contains(num-1))
            {
                int count=num;
                int streak=0;
                while(setExsist.contains(count))
                {
                    count=count+1;
                    streak=streak+1;
                }
            maxCount=Math.max(maxCount,streak);
            }
            
        }
        return maxCount;

    }
}