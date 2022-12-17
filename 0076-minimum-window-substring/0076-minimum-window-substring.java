class Solution {
    public String minWindow(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        
        HashMap<Character, Integer> map = new HashMap<>();


        for(int i=0; i<n2; i++){
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }

        int match = 0;
        String ans = "";
        int l = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;

        char ch[] = s.toCharArray();
        for(int i=0; i<n1; i++){
            if(map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i])-1);
                if(map.get(ch[i])==0){
                    match++;
                }

            }
            while(match == map.size()){
                if((i-l+1) < min) {
                    min = (i - l + 1);
                    start = l;
                }
                char del = s.charAt(l++);
                if(map.containsKey(del)){
                    if(map.get(del) == 0){
                        match--;
                    }
                    map.put(del, map.get(del) + 1);
                }
            }
        }
        
        return min > s.length() ? "" : s.substring(start,start+min);
    }

    /*
    Approch
    map
    a = 0
    b = 1
    c = 0

    match = 1;

    0123456789012
    adobecodebanc
       l
         i
       d



    map - 1;right
    the if map.get(r) == 0 then and then olny match++;


    min = i-l+1
    5-0+1 = 6
    9-3+1 = 7
    10-5+1 = 6
    12-9+1 = 4
    
    O(n);
    */
}