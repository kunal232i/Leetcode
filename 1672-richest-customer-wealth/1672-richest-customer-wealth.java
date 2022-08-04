class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int i=0; i< accounts.length; i++){
            int sum = 0;
            for(int a=0; a<accounts[i].length; a++){
                sum+=accounts[i][a];
            }
            if(sum > ans)
        {
            ans=sum;
        }
        }
        
        return ans;
    }
}