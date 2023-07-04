class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char [] chars = s.toCharArray();
        int i=0, j=chars.length-1;
        
        while(i<j){
            if(chars[i] != chars[j]){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}