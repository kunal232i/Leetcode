class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        List<Integer> ans = new ArrayList<>();
        while(i < nums.length){
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct] && nums[i] <= nums.length) {
                    swap(nums, i, correct);
                }else{
                    i++;
                }
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j] != j+1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int start,int end){
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }
}