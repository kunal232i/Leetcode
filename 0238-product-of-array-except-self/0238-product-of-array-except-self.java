class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int right = 1, left = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }
        return output;
    }
        // time limit exceeeded
//         int len = nums.length-1;
//         int ans[] = new int[nums.length];
        
//         for(int i=0;i<=len;i++){
//             ans[i] = range(nums,0,i-1) * range(nums,i+1, len);
//         }
//         return ans;

//     }

//     static int range(int nums[],int start,int end) {
//         int prod = 1;
//         for (int i=start;i<=end;i++){
//             prod *= nums[i];
//         }
//         return prod;
//     }
}