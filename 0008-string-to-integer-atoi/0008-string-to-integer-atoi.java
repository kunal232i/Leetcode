class Solution {
    public int myAtoi(String s) {
        if(s == null) return 0;
        s=s.trim();
        if(s.length()==0) return 0;
        
        int sign = +1;
        int i = 0;
        long ans = 0;
        
        if(s.charAt(0) == '-'){
                sign=-1;
                i++;
        }else if(s.charAt(0) == '+'){
            i++;
        }
        
        int MIN = Integer.MIN_VALUE;
        int MAX = Integer.MAX_VALUE;
        
        while(i<s.length()){
            if(!Character.isDigit(s.charAt(i)))break;
            
            if((s.charAt(i) -'0'>=0 && s.charAt(i) -'0'<=9)){
                    ans = ans * 10 + s.charAt(i) - '0';
            }
            if(sign == -1 && -1*ans < MIN) return MIN;
            if(sign == 1 && ans > MAX) return MAX;
            i++;
        }
        
        return (int)(ans*sign);
    }
}