class Solution {
    public String multiply(String num1, String num2) {
        char arr1[] = num1.toCharArray();
        char arr2[] = num2.toCharArray();
        int n1 = arr1.length;
        int n2 = arr2.length;
        char res[] = new char[n1+n2];
        Arrays.fill(res, '0');
        
        for(int i=n2-1; i>=0; i--){
            for(int j=n1-1; j>=0; j--){
                int product = (arr1[j]-'0')*(arr2[i]-'0');
                int temp  = res[j+i+1] - '0' + product;
                res[j+i+1] = (char)(temp%10 +'0'); 
                res[j+i] = (char)((res[j+i] -'0'+ (temp/10))+'0');
            }
        }
        
        StringBuilder sb = new StringBuilder();
        boolean visit = false;
        
        for(char c: res){
            if(c=='0' && !visit) continue;
            sb.append(c);
            visit = true;
        }
        return sb.length()==0 ? "0":sb.toString();
    }
}