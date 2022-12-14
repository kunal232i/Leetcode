class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        
        if(n<=2) return n;
        int max = 2;
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n; j++){
                int x1=points[i][0], y1=points[i][1], x2=points[j][0], y2=points[j][1];
                int count=2;
                for(int m=0; m<n; m++){
                    int x3=points[m][0], y3=points[m][1];
                    if(m != i && m != j){
                        if((x2-x1) * (y3-y1) == (x3-x1) * (y2-y1))count++;
                    }
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}