class Solution {
    public int characterReplacement(String s, int k) {
        
        Map<Character, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int res = 0;
        int l=0;
        
        for(int r=0; r<s.length(); r++){
            char chL = s.charAt(l);
            char chR = s.charAt(r);
            
            map.put(chR, map.getOrDefault(chR, 0)+1);
            maxFreq = Math.max(maxFreq, map.get(chR)); 
            
            while((r-l)+1 - maxFreq > k){
                map.put(chL, map.get(chL)-1);
                l++;
            }
            
            res = Math.max(res, (r-l)+1);
        }
        
        return res;
        
    }
}