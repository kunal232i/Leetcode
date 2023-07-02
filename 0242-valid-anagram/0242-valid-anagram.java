class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];
        
        for(char x : s.toCharArray()){
            count[x - 'a']++;
        }
        
        for(char y : t.toCharArray()){
            count[y - 'a']--;
        }
        
        for(int val : count){
            if(val != 0){
                return false;
            }
        }
        return true;
    }
}