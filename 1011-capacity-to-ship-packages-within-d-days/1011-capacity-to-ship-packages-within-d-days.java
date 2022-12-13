class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 0;
        for (int w: weights) {
            l = Math.max(l, w);
            r += w;
        }
        while (l < r) {
            int m = (l + r) / 2, need = 1, cur = 0;
            for (int w: weights) {
                if (cur + w > m) {
                    need += 1;
                    cur = 0;
                }
                cur += w;
            }
            if (need > days) l = m + 1;
            else r = m;
        }
        return l;
    }
}