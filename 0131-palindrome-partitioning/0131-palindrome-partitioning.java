class Solution {
   
     public void rec(List<List<String>> ans, String s, List<String> ds){
       if(s == null || s.length() == 0){
           ans.add(new ArrayList<>(ds));
           return;
       }
       
        for(int i=1; i<=s.length(); i++){
            String temp = s.substring(0, i);
            if(!isPalindrome(temp)) continue; 
                ds.add(temp);
                rec(ans, s.substring(i, s.length()), ds);
                ds.remove(ds.size()-1);
        }
        return;
       
   }
    
    public boolean isPalindrome(String s){
        for(int i=0;i<s.length()/2;i++) {
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
                return false;
            }
        }   
        return true;
    }

    
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        rec(ans, s, new ArrayList<>());
        return ans;
    }
}