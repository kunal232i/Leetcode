class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int[] nums = new int[n+1];
        
        
        for(int[] p : trust){
            nums[p[0]]--;
            nums[p[1]]++;
        }
        
        for(int i=1; i<=n; i++){
            if(nums[i] == n-1) return i;
        }
        return -1;
    }
}