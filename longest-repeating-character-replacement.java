class Solution {
    public int characterReplacement(String s, int k) {
      int[] count=new int[26];
      int left=0;int maxcount=0;
      for(int right=0;right<s.length;right++)
      {
        count[(s.charAt(right)-'A')++]
        maxcount=Math.max(maxcount,count[(s.charAt(right)-'A')])
        while((r-l)+1>k)
        {
            l++;
            count((s.charAt(right)-'A'))--;

        }
        result=Math.max(result,(r-l)+1);
      }
      return result;
    }
}

// we will use sliding window and hash map
//needed time to learn about sliding window(dynamic)