class Solution {
    
     void backtrack(Set<List<Integer>> ans,int[] nums, int ind, List<Integer> ds){
        ans.add(new ArrayList<>(ds));
        // System.out.println(ds);
        for(int i=ind; i<nums.length;i++){
            ds.add(nums[i]);
            backtrack(ans, nums, i+1, ds);
            ds.remove(ds.size()-1);
        }
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        
        backtrack(ans, nums, 0, new ArrayList<>());
        
        return new ArrayList<>(ans);
    }
}