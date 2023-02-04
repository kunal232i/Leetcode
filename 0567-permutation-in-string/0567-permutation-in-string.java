class Solution {
     public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        int[] s1map = new int[26];
        for (int i = 0; i < s1.length(); i++)
            s1map[s1.charAt(i) - 'a']++;
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int[] s2map = new int[26];
            for (int j = 0; j < s1.length(); j++) {
                s2map[s2.charAt(i + j) - 'a']++;
            }
            if (matches(s1map, s2map))
                return true;
        }
        return false;
    }
    
    public boolean matches(int[] s1map, int[] s2map) {
        for (int i = 0; i < 26; i++) {
            if (s1map[i] != s2map[i])
                return false;
        }
        return true;
    }
//     public String sort(String s) {
//         char[] t = s.toCharArray();
//         Arrays.sort(t);
//         return new String(t);
//     }
//     public boolean checkInclusion(String s1, String s2) {
        
//         s1 = sort(s1);
//         for (int i = 0; i <= s2.length() - s1.length(); i++) {
//             System.out.println(sort(s2.substring(i, i + s1.length())));
//             if (s1.equals(sort(s2.substring(i, i + s1.length()))))
//                 return true;
//         }
//         return false;
//     }
}