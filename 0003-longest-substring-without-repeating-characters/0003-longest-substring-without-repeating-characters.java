class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int j = 0;
        int res = 0;
        Set<Character> set = new HashSet<>();
        
        for(int i=0; i<chars.length; i++){
            while(j<chars.length && set.contains(chars[i])){
                set.remove(chars[j]);
                j++;
            }
            set.add(chars[i]);
            System.out.println(set);
            res = Math.max(res,set.size());
        }
        
        
        return res;
    }
}