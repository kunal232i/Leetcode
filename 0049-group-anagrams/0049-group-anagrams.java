class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList();
        Map<String, List<String>> map = new HashMap<>();
        
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String newString = new String(chars);
            
            if(!map.containsKey(newString)){
                 map.put(newString,new ArrayList<>());
            }
            map.get(newString).add(str);
        }
        res.addAll(map.values());
        
        return res;
    }
}