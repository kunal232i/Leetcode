class Solution {
   
     public void rec(List<List<String>> ans, String s, int ind, List<String> ds){
       if(ind == s.length()){
           ans.add(new ArrayList<>(ds));
           return;
       }
       
        for(int i=ind; i<s.length(); i++){
            if(isPalindrome(s, ind, i)){  
                ds.add(s.substring(ind, i+1));
                rec(ans, s, i+1, ds);
                ds.remove(ds.size()-1);
            }
        }       
   }
    
    public boolean isPalindrome(String s, int start, int end){
       while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

    
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        rec(ans, s, 0, new ArrayList<>());
        return ans;
    }
}