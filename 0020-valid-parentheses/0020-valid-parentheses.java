class Solution {
    
    public boolean isOpenBracket(char bracket){
        if(bracket == '(' || bracket == '{' || bracket == '['){
            return true;
        }
        return false;
    }
     public boolean isOpenCloseBracket(char o, char c){
        if((o == '(' && c == ')') || (o == '{' && c == '}') || (o == '[' && c ==']')){
            return true;
        }
        return false;
    }
    
    
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            
            char c = s.charAt(i);
            
            if(isOpenBracket(c)){
                st.push(c);
            }else if(!isOpenBracket(c)){
                if(st.isEmpty()){
                    return false;
                }
                if(!isOpenCloseBracket(st.pop(), c)){
                   return false;
                }
            }
        }
        
        return st.isEmpty();
    }
}