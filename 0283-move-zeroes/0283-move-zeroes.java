class Solution {
public void moveZeroes(int[] nums) {
        int length = nums.length-1;
            for(int i=0;i<length;i++){
                for (int j=i;j<=length;j++) {
                    if (nums[i] == 0) {
                        swap(nums, i, j);
                    }
                }

            }
    }
public void swap(int[] arr,int S,int E){
        int temp = arr[S];
        arr[S] = arr[E];
        arr[E] = temp;
    }
}