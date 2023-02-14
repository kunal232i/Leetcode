class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        String result = "";
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0 || carry > 0; i--, j--) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }
            carry = sum >> 1;
            sum &= 1;
            result = sum + result;
        }
        System.out.println(result); 
        return result;
    }
}