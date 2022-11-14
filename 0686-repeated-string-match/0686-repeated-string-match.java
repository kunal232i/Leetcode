class Solution {
    public int repeatedStringMatch(String a, String b) {
        int i = 1;
        StringBuilder sb = new StringBuilder(a);
        
        while(sb.length()<b.length()){
            sb.append(a);
            i++;
        }
        
        if(sb.indexOf(b)!=-1){
            return i;
        }else{
            sb.append(a);
            i++;
        }
        
        
        if(sb.indexOf(b)!=-1){
            return i;
        }else{
            return -1;
        }
        
    }
}