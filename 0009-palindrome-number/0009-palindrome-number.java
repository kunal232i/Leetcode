class Solution {
    public boolean isPalindrome(int x) {
    int num = 0,k,val = x;
        while (val > 0) {
            num *= 10;
            k = val % 10;
            num += k;
            val = val / 10;
        }

        if (x == num) {
            return true;
        } else {
            return false;
        }
    }
}