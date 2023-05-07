class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        for(int j=0;j<nums.length; j++){
            if(!set.contains(nums[j]-1)){
                int length = 0;
                while(set.contains(nums[j]+length)){
                    length++;
                }
                longest = Math.max(length,longest);
            }
        }
        return longest;
    }
}