class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        
        String ans = "";
        
        for(int i=0; i<s.length(); i++){
            st.push(s.charAt(i));
            char a = st.peek();
            if(a == '*'){
                st.pop();
                st.pop();
            }
        }
        
        for(int i=0; i<st.size(); i++){
            ans += st.get(i);
        }
        return ans;
    }
}