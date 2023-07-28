class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int h = 0, area = 0;
        int len = height.length-1;
        int l = 0, r = len;
        
        while(l<r){
            h = Math.min(height[l], height[r]);
            area = (r-l) * h;
            res = Math.max(res, area);
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return res;
    }
}