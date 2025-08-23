class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s2Count=new int[26];
        int[] s1Count=new int[26];
        for(char c:s1.toCharArray())
        {
            s1Count[(c-'a')]++;
        }
        int windowSize=s1.length();
        for(int i=0;i<s2.length();i++)
        {
            s2Count[s2.charAt(i)-'a']++;
            if(i>=windowSize)
            {
                s2Count[s2.charAt(i-windowSize)-'a']--;
            }
        if (matches(s1Count, s2Count)) return true;
        }
        return false;
    }
     private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
//lets use sliding window for this as we have to find subarray
l