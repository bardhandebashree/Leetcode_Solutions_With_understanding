class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // quick check
        }

        int[] sCount = new int[26];

        for (char c : s.toCharArray()) {
            sCount[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            sCount[c - 'a']--;
        }

        for (int i = 0; i < sCount.length; i++) {
            if (sCount[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
