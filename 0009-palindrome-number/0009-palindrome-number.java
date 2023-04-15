class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int a = x;
        while(x != 0){
            rev = rev*10 + x%10;
            System.out.println(rev);
            x = x/10;
        }
        
        if(rev == a && a >= 0){
            return true;
        }else{
            return false;
        }
    }
}