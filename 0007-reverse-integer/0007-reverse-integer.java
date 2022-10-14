class Solution {
    public int reverse(int x) {
        int num=0,k,val=x;
         while (val != 0) {
            if(num>Integer.MAX_VALUE/10 || num<Integer.MIN_VALUE/10){
                return 0;
            }
            num = num * 10;
            k = val % 10;
            num = num + k;
            val = val / 10;
        }
        return num;
    }
}