class Solution {
    public boolean detectCapitalUse(String word) {
        char[] words = word.toCharArray();
        
        if(word.length() < 2) return true;
        
        if(Character.isUpperCase(words[0]) && Character.isUpperCase(words[1])){
            for(int i=2; i<words.length; i++){
                if(Character.isLowerCase(words[i])){
                    return false;
                }
            }
        }else{
             for(int i=1; i<words.length; i++){
                if(Character.isUpperCase(words[i])){
                    return false;
                }
            }
        }
        return true;
    }
}