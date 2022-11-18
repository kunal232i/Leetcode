class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        // 2.Optimized
        
        int start =1;
        int end = 1;
        for(int p : piles){
            end = Math.max(p,end);
        }
        while(start<end){
            int hours = 0;
            int k = start + (end-start)/2;
            for(int p: piles){
                hours += Math.ceil((double)p/k);
            }

            if(hours<=h){
                end = k;
            }else{
                start = k + 1;
            }
        }
        return end;
        
        // 1. TLE 
        // int end = Integer.MIN_VALUE;
        // for(int p : piles){
        //     end = Math.max(p,end);
        // }
        // int res = end;
        // int hours = 0;
        // for(int k=end; k>=0; k--){
        //     for(int p: piles){
        //         hours += Math.ceil((double)p/k);
        //     }
        //     if(hours<=h){
        //         res = Math.min(res, k);
        //         hours = 0;
        //     }
        // }
        // return res; 
    }
}