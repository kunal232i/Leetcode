class Solution {
    public int leastInterval(char[] tasks, int n) {
        int char_count[] = new int[26];

        for(char c : tasks){
            char_count[c - 'A']++;
        }

        Arrays.sort(char_count);
        int max_Val = char_count[25]-1;
        int idle = max_Val * n;

        for(int i=24; i>=0;i--){
            idle -= Math.min(char_count[i],max_Val);
        }

        return idle >0 ? idle + tasks.length : tasks.length;
    }
}