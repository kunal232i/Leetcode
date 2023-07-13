class Solution {
    
    // public int countSetBits(int num){
    //     int cnt = 0;
    //     while(num>0){
    //         cnt += num&1;
    //         num >>= 1;
    //     }
    //     return cnt;
    // }
    
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.bitCount(i);
        }
        return arr;
    }
}