class Solution {
    public int maxProfit(int[] prices) {
        //finding minimum
        int j=0;
        int diff=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[j]<prices[i])
            {
                if(diff<prices[i]-prices[j]){
                diff=prices[i]-prices[j];
                }
            }
            else
            {
                j=i;
            }
        }
        return diff; 
    }
}