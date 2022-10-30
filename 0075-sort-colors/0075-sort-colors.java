class Solution {
    public void sortColors(int[] arr) {
        int zIndex=0, tIndex = arr.length-1, i=0;
        while(i <= tIndex){
            if( arr[i] == 0 ){
                swap(arr, zIndex++, i++);
            }
            else if(arr[i] == 2){
                swap(arr, tIndex--, i);
            }else
                i++;
        }
    }
    
    public void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}