class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j = 0;
        int res = 0;
        Set<Character> set = new HashSet<>();
        
        for(int i=0; i<s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            res = Math.max(res,set.size());
        }
    
        return res;
    }
}