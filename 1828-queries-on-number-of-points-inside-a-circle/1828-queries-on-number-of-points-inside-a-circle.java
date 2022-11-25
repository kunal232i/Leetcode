class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int ans[] = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int count = 0;
            for(int j=0; j<points.length; j++){
                if(Math.pow((queries[i][0]-points[j][0]),2) + Math.pow((queries[i][1]-points[j][1]),2) <= Math.pow((queries[i][2]),2)){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}