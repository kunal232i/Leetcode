class Solution {
    void rec(int[] nums, Set<List<Integer>> ans, int ind, List<Integer> ds){
        if(ds.size()>=2){
            ans.add(new ArrayList<>(ds));
        }
        
        
        for(int i=ind; i<nums.length; i++){
            if(ds.size()==0 || ds.get(ds.size()-1) <= nums[i]){
                ds.add(nums[i]);
                rec(nums, ans, i+1, ds);
                ds.remove(ds.size()-1);
            }
        }
        
    }
    
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>(); 
        rec(nums, ans, 0, new ArrayList<>());
        return new ArrayList(ans);
    }
}