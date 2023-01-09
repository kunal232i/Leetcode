class Solution {
    
    static void findCombinations(int[] arr, List<List<Integer>> ans, int n, int ind, List<Integer> ds){
        ans.add(new ArrayList<>(ds));

        for(int i=ind; i<n; i++){
            if( i!=ind && arr[i] == arr[i-1]) continue;

            ds.add(arr[i]);
            findCombinations(arr, ans, n, i+1, ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(nums, ans, n, 0, new ArrayList<>());
        return ans;
    }
}