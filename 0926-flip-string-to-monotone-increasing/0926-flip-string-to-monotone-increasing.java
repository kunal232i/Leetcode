class Solution {
    public int minFlipsMonoIncr(String s) {
        int flips = 0;
        int num_ones = 0;
        
        for(char ch : s.toCharArray()){ 
            if(ch == '1'){
                num_ones++;
            }else if(num_ones > 0){
                flips++;
                num_ones--;
            }
        }
        return flips;
    }
}