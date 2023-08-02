class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int res = 0;
        Arrays.sort(intervals, Comparator.comparingInt(o->o[0]));
        int prevEnd= intervals[0][1];
        
       for (int i = 1; i < intervals.length; i++) {
            int Start = intervals[i][0];
            int End = intervals[i][1];
            
            if(Start >= prevEnd){
                prevEnd = End;
            }else{
                res++;
                prevEnd = Math.min(prevEnd, End);
            }
        }
        return res;
    }
}