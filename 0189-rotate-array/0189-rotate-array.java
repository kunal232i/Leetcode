class Solution {
    public void rotate(int[] nums, int k) {
        int l = 0;
        int r = nums.length-1;
        k = k%nums.length;
        reverse(nums,l,r);
        reverse(nums,l,k-1);
        reverse(nums,k,r);
    }

    static public void reverse(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}