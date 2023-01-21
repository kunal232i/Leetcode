class Solution {
    void rec(List<String> ans, String s, int i, List<String> ds){
        if(ds.size() == 4){
            if(i == s.length()){
                ans.add(String.join(".", ds));
            }
        }else{
            for (int j = i + 1; j <= i + 3 && j <= s.length(); j++) {
                    String nextInt = s.substring(i, j);
                    if (Integer.parseInt(nextInt) <= 255 && (nextInt.equals("0") || !nextInt.startsWith("0"))) {
                        ds.add(nextInt);
                        rec(ans, s, j, ds);
                        ds.remove(ds.size()-1);
                    }
            }
        }
    }
    
    public List<String> restoreIpAddresses(String s) { 
        List<String> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        
        rec(ans, s, 0, ds);
        
        return ans;
    }
}