class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l = 0;
        int r = cardPoints.length - k;
        int sum = 0;

        for(int i=r; i<cardPoints.length;i++){
            sum += cardPoints[i];
        }
        int ans = sum;
        while(r < cardPoints.length) {
            sum = (sum - cardPoints[r]) + cardPoints[l];
            l++;
            r++;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}