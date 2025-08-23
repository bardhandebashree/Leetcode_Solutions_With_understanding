class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pCount=new int[26];
        int[] sCount=new int[26];
        List<Integer> res=new ArrayList<>();
        for(char c:p.toCharArray())
        {
            pCount[(c-'a')]++;
        }
        int ws=p.length();
        for(int i=0;i<s.length();i++)
        {
            sCount[(s.charAt(i)-'a')]++;
            if(i>=ws)
            {
                sCount[(s.charAt(i-ws)-'a')]--;
            }
            boolean result=match(sCount,pCount);
            if(result==true)
            {
                res.add((i+1)-ws);
            }
            
        }
        return res;
    }
        public boolean match(int[] sCount,int[] pCount)
        {
            for(int i=0;i<26;i++)
            {
                if(sCount[i]!=pCount[i])
                {
                    return false;
                }
            }
            return true;
        }


    }
