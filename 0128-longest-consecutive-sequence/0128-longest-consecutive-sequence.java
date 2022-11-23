class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;

        //use HashSet for not repeated nums
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        for(int j=0;j<nums.length; j++){
            
            // prev ele check
            if(!set.contains(nums[j]-1)){
                int length = 0;
                
                // ele++ contains then len++
                while(set.contains(nums[j]+length)){
                    length++;
                }
                // max of all longest longestConsecutive
                longest = Math.max(length,longest);
            }
        }
        return longest;
    }
}