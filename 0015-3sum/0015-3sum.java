class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length-1;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<=len;i++) {
            int front = i+1;
            int back = len;
            while(front<back) {
                int threeSum = nums[i]+nums[front]+nums[back];

                if (threeSum > 0 ) {
                    back--;
                }else if (threeSum < 0){
                    front++;
                }else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[front]);
                    list.add(nums[back]);
                    result.add(list);
                    while(front<back && nums[front]==list.get(1))front++;
                    while(front<back && nums[back]==list.get(2))back--;
                }
            }
            while(i + 1 <= len && nums[i]==nums[i+1])i++;
        }
       return result;
    }
}