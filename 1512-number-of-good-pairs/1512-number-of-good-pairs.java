class Solution {
    public int numIdenticalPairs(int[] nums) {
     int n=0;
        int[] count = new int[101];
        for(int num: nums){
            n += count[num]++;
        }
        return n;
    }
}