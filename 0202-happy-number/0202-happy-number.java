class Solution {
    public boolean isHappy(int n) {
        
//         if(n==1 || n==-1) return true;
        
        Set<Integer> visit = new HashSet<>();
        
        while(!visit.contains(n)){
            visit.add(n);      
            n = powerSum(n);
            if(n==1) return true;
        }
        return false;
    }
    
    public int powerSum(int n){
        int output = 0;
        while(n != 0){
            int digit = n%10;
            digit = digit * digit;
            output += digit;
            n = n/10;
        }
        return output;
    }
}