public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        int len = 32;
        while(len!= 0){
            res += n & 1;
            n = n >> 1;
            len--;
        }
        return res;
    }
}