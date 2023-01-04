class Solution {
    public int minimumRounds(int[] tasks) {
        
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<tasks.length; i++){
            map.put(tasks[i], map.getOrDefault(tasks[i],0)+1);
        }
        
        for(int freq : map.values()){
            if(freq == 1) return -1;
            ans += (freq + 2)/3;
        }
        
        return ans;
    }
}