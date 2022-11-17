class Solution {
    public int rob(int[] nums) {
        int a = 0;
        int b = 0;
        
        for(int i=0; i<nums.length; i++){
            int tmp = Math.max(nums[i] + a, b);
            a = b;
            b = tmp;
        }
        return b;
    }
}