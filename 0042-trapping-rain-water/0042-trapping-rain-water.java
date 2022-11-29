class Solution {
    public int trap(int[] height) {
        int maxL[] = new int[height.length];
        int maxR[] = new int[height.length];

        int l = 0;
        int r = height.length-1;
        int ans = 0;
        int i = 1;
        int j = r-1;

        while(i!=height.length+1 && j!=-1){
            maxL[i] = Math.max(height[l],maxL[l]);
            i++;
            l++;
            maxR[j] = Math.max(height[r],maxR[r]);
            r--;
            j--;
        }

        for (int m=0; m<height.length; m++){
            if((Math.min(maxL[m],maxR[m])-height[m])>=0){
                ans += (Math.min(maxL[m],maxR[m])-height[m]);
            }
        }

        return ans;
    }
}