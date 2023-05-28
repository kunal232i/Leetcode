class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> tb = new HashMap<>();

        
        for(int num : nums){
            tb.put(num, tb.getOrDefault(num,0)+1);
            
            if(tb.get(num) != 1){
                return true;
            }
        }
        return false;
        
        
    }
}