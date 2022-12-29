class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(o->o[0]));
        int[] curr_interval = intervals[0];
        res.add(curr_interval);
        
        for(int[] interval: intervals){
            int curr_start = curr_interval[0];
            int curr_end = curr_interval[1];
            int next_s = interval[0];
            int next_e = interval[1];
            
            if(curr_end >= next_s){
                curr_interval[1] = Math.max(curr_end,next_e);
            }else{
                curr_interval=interval;
                res.add(curr_interval);
            }
            
        }
        return res.toArray(new int[res.size()][]);
    }
}