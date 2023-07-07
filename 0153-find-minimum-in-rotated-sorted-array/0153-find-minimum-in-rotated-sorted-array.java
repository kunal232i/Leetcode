class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1;
        int minNum = Integer.MAX_VALUE;
        while(l <= r){
            int mid = l+(r-l)/2;
        
            if(nums[mid] >= nums[l] && nums[mid] > nums[r]){
                l = mid+1;
            }else {
                r = mid-1;
            }
            minNum = Math.min(minNum, nums[mid]);
        }
        return minNum;
    }
}