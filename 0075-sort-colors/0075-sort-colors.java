class Solution {
    public void sortColors(int[] arr) {
        int fInd=0, sInd=arr.length-1, i=0;
        
        while(i<=sInd){
            if(arr[i]==0){
                swap(arr,fInd++, i++);
            }else if(arr[i]==2){
                swap(arr,sInd--,i);
            }else{
                i++;
            }
        }
    }
    
    public static void swap(int[] arr,int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}