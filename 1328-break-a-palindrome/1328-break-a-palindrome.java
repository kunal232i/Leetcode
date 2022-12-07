class Solution {
    public String breakPalindrome(String palindrome) {
        char s[] = palindrome.toCharArray();
        int n = palindrome.length();

        for(int i=0; i<n/2; i++){
            if(s[i]!='a'){
                s[i]='a';
                return String.valueOf(s);
            }
        }
        s[n-1] = 'b';
        return n<=1 ? "": String.valueOf(s);
    }
}