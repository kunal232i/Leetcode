class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int res = 0;
        
        for(int num : nums){
            set.add(num);
        }
        
        for(int num : nums){
            int cnt = 1;
            if(!set.contains(num-1)){
                while(set.contains(num+1)){
                    cnt++;
                    num++;
                }
            }
            res = Math.max(res, cnt);
        }
        
        return res;
    }
}