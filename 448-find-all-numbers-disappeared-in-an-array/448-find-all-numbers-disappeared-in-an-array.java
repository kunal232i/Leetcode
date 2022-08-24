class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
         int i=0;
        while(i < arr.length){
            int correct = arr[i]-1;
            //checks if nums is already in there place if not then swap
            if(arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        //sorted array
        //and check for missing num and returns it
        for(int j=0; j<arr.length; j++){
            if(arr[j] != j+1){
                ans.add (j+1);
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