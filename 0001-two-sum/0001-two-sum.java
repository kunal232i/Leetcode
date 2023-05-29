class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int ele = target - nums[i];
            if(map.containsKey(ele)){
                return new int[]{map.get(ele), i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{-1};
    }
}