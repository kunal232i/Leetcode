class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if(pattern.length() != words.length){
            return false;
        }
        
        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        
        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            if(charToWord.containsKey(ch) && !charToWord.get(ch).equals(words[i])){
                return false;
            }
            if(wordToChar.containsKey(words[i]) && !wordToChar.get(words[i]).equals(ch)){
                return false;
            }
            charToWord.put(ch,words[i]);
            wordToChar.put(words[i],ch);
        }
        return true;
    }
}