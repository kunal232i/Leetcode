class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int ans = 0;
        int n = costs.length;
        Arrays.sort(costs);
        
        while(ans < n && costs[ans] <= coins){
            coins -= costs[ans];
            ans++;
        }
        
        return ans;
        
    }
}