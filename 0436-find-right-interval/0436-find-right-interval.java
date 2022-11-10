class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        
        if(n==1){
            return new int[]{-1};
        }
        int result[]= new int[n];
        for(int i=0;i<n;i++){
            result[i]=getindex(intervals,intervals[i][1]);
        }
        return result;
    }
    
    public int getindex(int[][] intervals,int key){
        for(int i=0;i<intervals.length;i++){
            if(key==intervals[i][0]){
                return i;
            }
        }
        
        for(int i=0;i<intervals.length;i++){
            if(key<intervals[i][0]){
                return i;
            }
        }
        return -1;
    }
}