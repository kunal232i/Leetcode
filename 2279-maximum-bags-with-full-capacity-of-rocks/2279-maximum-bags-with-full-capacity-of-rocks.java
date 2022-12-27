class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        for(int i=0; i<n; i++){
            capacity[i] -= rocks[i]; 
        }
        
        Arrays.sort(capacity);
        int cnt = 0;
        
        for(int i=0; i<n; i++){
            if(capacity[i] == 0){
                cnt++;
            }else if(capacity[i]<=additionalRocks){
                cnt++;
                additionalRocks -=  capacity[i];
            }
        }
        return cnt;
        
/*        
Maximum Bags With Full Capacity of Rocks
n bags 
0 - n-1
capacity = 2 3 4 5
rocks =    1 2 4 4
	     1 1  0 1
additional rocks = 2

sort


loop
if(cap == 0) cnt++
if(cap <= addR)
cnt++
addR -= cap


return cnt

        */
    }
}