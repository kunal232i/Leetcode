class Solution {
    public long mod = 1000000007;
    public long pow(long b, long p){
        long ans = 1;
        
        if(p == 0)return 1;
        ans = pow(b,p/2);
        if(p%2==0){
            return (ans*ans)%mod;
        }
        else{
            return (b*ans*ans)%mod;
        }
    }
    
    public int countGoodNumbers(long n) {
        long even = (n/2) + (n%2);
        long odd = (n/2);
        return (int)(pow(5,even)*pow(4,odd)%mod);
    }
    
    
}