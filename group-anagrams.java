// I tried this brute force solution but if any way we can make the array of freq common factor 
//it would be great

// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         List<String> allStrings=Arrays.stream(strs).boxed().Collectors.toList();
//         List<String> resStrings=new ArrayList<>();
//         int flag=0;
//         int left=0;
//         int right=1;
//         int[] strNextCount=new int[26];
//         int[] strCount=new int[26];

//         while(allStrings.size()==0)
//         {
//             for (char c : strs[left].toCharArray())
//             {
//             strCount[c - 'a']++;
//             }
//             for (char c : strs[right].toCharArray()) {
//             strNextCount[c - 'a']++;
//             }

//             for (int i = 0; i < strCount.length; i++) {
//             if (strCount[i] != strNextCount[i]) {
//                 flag=-1;
//                 break;
//             }
//             }
//             if(flag==0)
//             {
//                 resStrings.add(strs[right]);
//                 resStrings.add(strs[left]);
//                 allStrings.remove(left);
//             }
//         }
        
//     }
// }

//So we will use HashMap
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<Strings>> sameFreq=new HashMap<>();
        int[] freq=new int[26];
        for(int i=0;i<strs.length;i++)
        {
            for(char s:strs[i].length)
            {
                freq[s-'a']++;
            }
            StringBuilder keyString=new StringBuilder();
            for(int f:freq)
            {
                keyString.append("#").append(f);
            }
            String key=keyString.toString();
            sameFreq.computeIfAbsent(key,key->new ArrayList<>();).put(strs[i]);
        }
        List<List<String>> result=new ArrayList<>();
        for(String key:sameFreq.keySet())
        {
            result.add(sameFreq.get(key));
        }
        return result;
        
    }
}