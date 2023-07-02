class Solution {
    
    public String sortedString(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }
    
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        s = sortedString(s);
        t = sortedString(t);
        if(s.equals(t)){
            return true;
        }
        return false;
    }
}