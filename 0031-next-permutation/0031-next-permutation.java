class Solution {
    public void swap(int[] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    
    public void reverse(int[] arr, int start, int end) {
        if (start >= end || start < 0 || end >= arr.length) {
            return;
        }
        while(start < end){
            swap(arr, start++, end--);
        }
    }
    
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;
        
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){ 
                ind = i;
                break;
            }
        }
        if(ind == -1){
            reverse(nums, 0, n-1);
            return;
        }
        for(int i=n-1; i>ind; i--){
            if(nums[i] > nums[ind]){
                swap(nums, ind, i);
                break;
            }
        }
        reverse(nums, ind+1, n-1);
    }
}