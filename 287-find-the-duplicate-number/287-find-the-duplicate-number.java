class Solution {
    public int findDuplicate(int[] nums) {
           int i=0;
        while(i < nums.length){
            if(nums[i] != i+1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct] && nums[i] <= nums.length) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int start,int end){
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }
}