class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        
        for(int num : nums){
            set.add(num);
        }
        
        for(int num : nums){   
            if(!set.contains(num-1)){
                int cnt = 1;
                while(set.contains(num+1)){
                    num++;
                    cnt++;
                }
                ans = Math.max(cnt,ans);
            }
        }
        return ans;
    }
}