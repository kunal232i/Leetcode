class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int currSum = 0;
        
        for(int n : nums){
            if(currSum < 0){
                currSum = 0;
            }
            currSum += n;
            maxSub = Math.max(maxSub,currSum);
        }
        
        return maxSub;   
    }
}