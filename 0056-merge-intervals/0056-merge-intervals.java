class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int currInterval[] = intervals[0];
        res.add(currInterval);
        
        for(int[] interval : intervals){
            int currStart = currInterval[0];
            int currEnd = currInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
            
            if(currEnd >= nextStart){
                currInterval[1] = Math.max(currEnd, nextEnd);
            }else{
                currInterval = interval;
                res.add(currInterval);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}