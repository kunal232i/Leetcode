class Solution {
    public void nextPermutation(int[] nums) {
        
        int i = nums.length-2;
        
        while(i>=0 && nums[i]>=nums[i+1])i--;
            if(i>=0){
                int r = nums.length-1;
                while(nums[r]<=nums[i])r--;
                swap(nums, i, r);
            }
            reverse(nums,i+1,nums.length-1);
        }    

    static void reverse(int arr[],int start,int end){
        while(start < end){
            swap(arr,start++,end--);
        }
    }
    static void swap(int arr[],int start,int end){
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }
}