class Solution {
    public int characterReplacement(String s, int k) {
    
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int ans = 0;
        int maxVal = 0;
        
        for(int r=0; r<s.length();r++){
            char chR = s.charAt(r);
            char chL = s.charAt(l);
            
            map.put(chR, map.getOrDefault(chR,0)+1);
            maxVal = Math.max(maxVal, map.get(chR));
            
            while((r-l+1) - maxVal > k){
                map.put(chL,map.get(chL)-1);
                l++;
            }
            
            ans = Math.max(ans, (r-l+1));
        }
        return ans;
    }
}