public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        HashMap<Character, Integer> map1 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++)
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            HashMap<Character, Integer> map2 = new HashMap<>();
            for (int j = 0; j < s1.length(); j++) {
                map2.put(s2.charAt(i + j), map2.getOrDefault(s2.charAt(i + j), 0) + 1);
            }
            if (matches(map1, map2))
                return true;
        }
        return false;
    }

    public boolean matches(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2) {
        for (char key : map1.keySet()) {
            if (map1.get(key) - map2.getOrDefault(key, -1) != 0)
                return false;
        }
        return true;
    }
}