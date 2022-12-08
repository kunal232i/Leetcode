class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<strs.length; i++){
            char s[] = strs[i].toCharArray();
            Arrays.sort(s);
            String tmp = new String(s);
            if(map.containsKey(tmp)){
                res.get(map.get(tmp)).add(strs[i]);
                continue;
            }
            
            List<String> ans = new ArrayList<>();
            ans.add(strs[i]);
            res.add(ans);
            map.put(tmp,res.size()-1);
        }    
        return res;
    } 
}