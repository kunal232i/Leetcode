class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    int target = 0;
    ArrayList<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
        for(int i = 0 ; i<=nums.length-1 ;i++){
        int rem  = target - nums[i] ;
        int front = i+1;
        int back = nums.length-1;
        while(front < back){
            int twoSum = nums[front] + nums[back];
            if(twoSum < rem)front++;
            else if(twoSum >rem)back--;
            else{
                List<Integer> triplet = new ArrayList<>();
                triplet.add(nums[i]);
                triplet.add(nums[front]);
                triplet.add(nums[back]);
                result.add(triplet);
                while(front < back && nums[front] == triplet.get(1))front++;
                while(front < back && nums[back] == triplet.get(2))back--;
            }
        }
        while( i+1<=nums.length-1 && nums[i] == nums[i+1]) i++;
    }
        return result;
    }
}