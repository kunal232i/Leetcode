class Solution {
    public int firstMissingPositive(int[] nums) {
    int i=0;
        while( i < nums.length) {
            if (nums[i] > 0 && nums[i] <= nums.length) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            } else {
                i++;
            }

        }


        for (int j=0; j < nums.length; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }

    static void swap(int[] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    
}