//algorithm that runs in O(n) time
//Space complexity-O(1)
//without using the division operation.
//two loops O(n^2)
//using recursion-O(n):TC, O(n):SC
    class Solution {
   public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[] res=new int[len];
        res[0]=1;
        prefixSol(nums,res,0,1);
        suffixSol(nums,res,len-1,1);
        return res;
    }
    public void prefixSol(int[] nums,int[] res,int i,int prefix) {

            if(i==nums.length) return;
            res[i]=prefix;
            prefixSol(nums,res,i+1,prefix*nums[i]);
    }
    public void suffixSol(int[] nums,int[] res,int i,int suffix) {
            if(i<0) return;
            res[i]=res[i]*suffix;
            suffixSol(nums,res,i-1,suffix*nums[i]);
    }
}