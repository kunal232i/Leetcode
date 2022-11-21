class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j= height.length-1;
        int max = 0;
        int ans = 0;
        while(i<j){
            max = (j-i) * Math.min(height[i],height[j]);
            ans = Math.max(ans,max);
            if(height[i]>=height[j]){
                j--;
            }else if(height[i]<=height[j]){
                i++;
            }
        }
        return ans;
    }
}