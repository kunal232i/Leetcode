class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        
        if(n<=2) return n;
 
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int count = 2;
                int x1 = points[i][0], y1 = points[i][1];
                int x2 = points[j][0], y2 = points[j][1];
            
                for(int m=j+1;m<n;m++){
                    int x3 = points[m][0], y3 = points[m][1];
                    if(m!=i && m!=j){
                        if(((y2-y1) * (x3-x1)) == ((y3-y1) * (x2-x1))) count++;
                    }
                }
                max = Math.max(count,max);
            }
        }
        return max;
    }
}