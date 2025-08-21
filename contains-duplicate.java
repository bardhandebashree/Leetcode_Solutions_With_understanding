class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet=new HashSet<>();
        for(int num:nums)
        {
            if(!numsSet.add(num)) //add .add() returns true if element is not present in set and has to be added
            //and false when element is already present in set
            return true;
        }
        return false;
    }
}

//i am thinking of using hash map
//But we can Use Hash Set - below solution only beats 7% 
// Arrays.stream(nums) → creates an IntStream.
// .boxed() → converts every int to Integer (auto-boxing).
// .collect(Collectors.toSet()) → creates a collector, then inserts one by one.
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Set<Integer> numsSet=Arrays.stream(nums).boxed().collect(Collectors.toSet());
         //used boxed it converts int->Integer basically wraps primitive to Wrapper classes
//         if(numsSet.size()!=nums.length)
//         {
//             return true;
//         }
//         else
//         return false;
//     }
// }